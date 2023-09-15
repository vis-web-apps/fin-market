package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.SavingsProducts;
import ru.myapps.finmarket.repository.SavingsProductsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SavingsProductsService {

    private final SavingsProductsRepository repository;

    public List<SavingsProducts> getAllSavingsProducts() {
        return repository.findAll();
    }
}
