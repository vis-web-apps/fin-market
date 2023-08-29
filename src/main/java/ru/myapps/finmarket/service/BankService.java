package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.Bank;
import ru.myapps.finmarket.repository.BankRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository repository;

    public List<Bank> getAllBanks() {
        return repository.findAll();
    }
}
