package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.myapps.finmarket.entity.Bank;

@Getter
@Setter
@RequiredArgsConstructor
public class CardProductDto {
    private final Long id;
    private final String name;
    private final Bank bank;
    private final String infoUrl;
    private boolean cashback;
    private boolean mile;
    private boolean point;
    private boolean free;
}
