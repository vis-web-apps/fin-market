package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
