package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RateDto {
    private final Long id;
    private final Long bankId;
    private final String bankName;
    private final String currencyName;
    private String buySum;
    private String saleSum;
}
