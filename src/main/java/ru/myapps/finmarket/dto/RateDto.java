package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RateDto {
    private final String bankName;
    private final String currencyName;
    private String buySum;
    private String saleSum;
}
