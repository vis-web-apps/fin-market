package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.Rate;
import ru.myapps.finmarket.repository.RateRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateService {

    private final RateRepository repository;

    public List<Rate> getAllRates(){
        return repository.findAllByOrderByStartDateTimeDesc();
    }

}
