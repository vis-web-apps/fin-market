package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.Currency;
import ru.myapps.finmarket.repository.CurrencyRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRepository repository;

    public Currency getCurrencyById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Currency getCurrencyByIsoLat3(String isoLat3) {
        return repository.findByIsoLat3(isoLat3).orElseThrow(EntityNotFoundException::new);
    }

    public List<Currency> getAllCurrencies() {
        return repository.findAll();
    }
}
