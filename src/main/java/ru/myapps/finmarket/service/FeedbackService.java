package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.FeedbackDto;
import ru.myapps.finmarket.entity.Feedback;
import ru.myapps.finmarket.repository.FeedbackRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public void create(FeedbackDto dto) {
        feedbackRepository.save(convert(new Feedback(), dto));
    }

    @Transactional
    public void edit(FeedbackDto dto) {
        Feedback feedback = feedbackRepository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        feedbackRepository.save(convert(feedback, dto));
    }

    public void delete(Long id) {
        feedbackRepository.deleteById(id);
    }

    public List<Feedback> getAllOrderByProcessed() {
        return feedbackRepository.findAll(Sort.by(Sort.Order.asc("processed")));
    }

    @Transactional
    public void changeStatus(Long id) {
        Feedback feedback = feedbackRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        feedback.setProcessed(!feedback.isProcessed());

        feedbackRepository.save(feedback);
    }

    private Feedback convert(Feedback feedback, FeedbackDto dto) {
        feedback.setName(dto.getName());
        feedback.setPhone(dto.getPhone());
        feedback.setEmail(dto.getEmail());
        feedback.setText(dto.getText());

        return feedback;
    }
}
