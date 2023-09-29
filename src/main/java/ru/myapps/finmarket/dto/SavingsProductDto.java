package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.myapps.finmarket.entity.Bank;
import ru.myapps.finmarket.entity.Currency;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
public class SavingsProductDto {
    private final Long id;
    private final String name;
    private final String promo;
    private final Bank bank;
    private final Currency currency;
    private final BigDecimal sum;
    private final BigDecimal rate;
}
