package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
