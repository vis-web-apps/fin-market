package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.CurrencyService;
import ru.myapps.finmarket.service.RateService;

@Controller
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;
    private final BankService bankService;
    private final CurrencyService currencyService;

    @GetMapping(value = "/rates")
    public String getAllRates(@RequestParam(required = false) String query, Model model) {

        model.addAttribute("rates", rateService.getRubRates2(query));
        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("currencies", currencyService.getAllCurrencies());
        model.addAttribute("query", query);

        return "rates";
    }
}
