package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.Currency;
import ru.myapps.finmarket.repository.CurrencyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository repository;

    public List<Currency> getAllCurrencies() {
        return repository.findAll();
    }
}
