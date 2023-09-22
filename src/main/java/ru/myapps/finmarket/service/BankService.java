package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.entity.Bank;
import ru.myapps.finmarket.repository.BankRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository repository;

    public Bank getById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Bank> getAllBanks() {
        return repository.findAll();
    }
}
