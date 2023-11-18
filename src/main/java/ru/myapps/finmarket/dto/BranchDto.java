package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.myapps.finmarket.entity.Bank;

@Getter
@Setter
@RequiredArgsConstructor
public class BranchDto {

    private Long id;
    private Bank bank;
    private String name;
    private String bic;
    private String address;
    private String schedule;
    private String contactPhone;
    private String contactEmail;

}
