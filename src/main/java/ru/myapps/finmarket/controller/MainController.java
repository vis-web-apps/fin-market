package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.CurrencyService;
import ru.myapps.finmarket.service.RateService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final BankService bankService;
    private final CurrencyService currencyService;
    private final RateService rateService;

    @GetMapping(value = "/")
    public String get(Model model) {
        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("currencies", currencyService.getAllCurrencies());
        model.addAttribute("rates", rateService.getAllRates());

        return "index";
    }

}
