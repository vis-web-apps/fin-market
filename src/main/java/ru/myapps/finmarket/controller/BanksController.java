package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.CurrencyService;
import ru.myapps.finmarket.service.RateService;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class BanksController {

    private final BankService bankService;

    @GetMapping(value = "/banks")
    public String getBanks(@RequestParam(required = false) String query, Model model) {

        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("query", query);

        return "banks";
    }
}
