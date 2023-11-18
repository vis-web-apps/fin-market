package ru.myapps.finmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.myapps.finmarket.entity.Branch;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class BankDto {
    private Long id;
    private String name;
    private String bic;
    private String webSite;
    private List<Branch> branches;
}
