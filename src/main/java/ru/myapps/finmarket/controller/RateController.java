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
public class RateController {

    private final RateService rateService;
    private final BankService bankService;
    private final CurrencyService currencyService;

    @GetMapping(value = "/rates")
    public String getAllRates(@RequestParam(required = false) String query, Model model) {

        model.addAttribute("rates", rateService.getRubRates2(query));
        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("currencies", currencyService.getAllCurrencies().stream().filter(cur -> !cur.getIsoLat3().equals("RUB")).collect(Collectors.toList()));
        model.addAttribute("query", query);

        return "rates";
    }

    @PostMapping(value = "/rates/create")
    public String createRate(@RequestParam("bankId") Long bankId,
                           @RequestParam("currencyId") Long currencyId,
                           @RequestParam("rateBuySum") BigDecimal rateBuySum,
                           @RequestParam("rateSaleSum") BigDecimal rateSaleSum
    ) {
        rateService.createRate(bankId, currencyId, rateBuySum, rateSaleSum);
        return "redirect:/rates";
    }

    @PostMapping(value = "/rates/edit")
    public String editRate(@RequestParam("bankId") Long bankId,
                           @RequestParam("currencyName") String currencyName,
                           @RequestParam("rateBuySum") BigDecimal rateBuySum,
                           @RequestParam("rateSaleSum") BigDecimal rateSaleSum
    ) {
        rateService.editRate(bankId, currencyName, rateBuySum, rateSaleSum);
        return "redirect:/rates";
    }

    @PostMapping(value = "/rates/delete")
    public String deleteRate(@RequestParam("bankId") Long bankId,
                           @RequestParam("currencyName") String currencyName
    ) {
        rateService.deleteRate(bankId, currencyName);
        return "redirect:/rates";
    }
}
