package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.myapps.finmarket.entity.Bank;

@Getter
@Setter
@RequiredArgsConstructor
public class PromoDto {

    private Long id;
    private Bank bank;
    private String promoName;
    private String promoText;

}
