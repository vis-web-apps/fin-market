package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.FeedbackDto;
import ru.myapps.finmarket.service.FeedbackService;

@Controller
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @GetMapping(value = "/feedback")
    public String getAll(Model model) {
        model.addAttribute("feedbacks", feedbackService.getAllOrderByProcessed());

        return "feedback";
    }

    @PostMapping(value = "/feedback/change-status")
    public String changeStatus(@ModelAttribute("id") Long id) {
        feedbackService.changeStatus(id);

        return "redirect:/feedback";
    }

    @PostMapping(value = "/feedback/create")
    public String createFeedback(@ModelAttribute("feedbackDto") FeedbackDto feedbackDto) {
        if (feedbackDto == null) {
            return "redirect:/faq";
        }
        feedbackService.create(feedbackDto);
        return "redirect:/faq";
    }

    @PostMapping(value = "/feedback/edit")
    public String editFeedback(@ModelAttribute("feedbackDto")  FeedbackDto feedbackDto) {
        if (feedbackDto == null) {
            return "redirect:/feedback";
        }
        feedbackService.edit(feedbackDto);
        return "redirect:/feedback";
    }

    @PostMapping(value = "/feedback/delete")
    public String deleteFeedback(@RequestParam("id") Long id) {
        feedbackService.delete(id);
        return "redirect:/feedback";
    }
}
