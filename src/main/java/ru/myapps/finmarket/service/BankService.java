package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.BankDto;
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

    public void create(BankDto dto) {
        Bank bank = new Bank();

        repository.save(convert(bank, dto));
    }

    @Transactional
    public void edit(BankDto dto) {
        Bank bank = repository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        repository.save(convert(bank, dto));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private Bank convert(Bank bank, BankDto dto) {
        bank.setName(dto.getName());
        bank.setBic(dto.getBic());
        bank.setWebSite(dto.getWebSite());
        bank.setBranches(dto.getBranches());

        return bank;
    }
}
