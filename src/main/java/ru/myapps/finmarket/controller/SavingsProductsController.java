package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.SavingsProductDto;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.CurrencyService;
import ru.myapps.finmarket.service.SavingsProductsService;

@Controller
@RequiredArgsConstructor
public class SavingsProductsController {

    private final SavingsProductsService savingsProductsService;
    private final BankService bankService;
    private final CurrencyService currencyService;

    @GetMapping(value = "/savings-products")
    public String getSavingsProducts(Model model) {
        model.addAttribute("savingsProducts", savingsProductsService.getAllSavingsProducts());
        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("currencies", currencyService.getAllCurrencies());

        return "savings-products";
    }

    @PostMapping(value = "/savings-products/create")
    public String createSavingsProduct(@ModelAttribute("savingsProductDto") SavingsProductDto savingsProductDto) {
        if (savingsProductDto == null) {
            return "redirect:/savings-products";
        }
        savingsProductsService.create(savingsProductDto);
        return "redirect:/savings-products";
    }

    @PostMapping(value = "/savings-products/edit")
    public String editSavingsProduct(@ModelAttribute("savingsProductDto") SavingsProductDto savingsProductDto) {
        if (savingsProductDto == null) {
            return "redirect:/savings-products";
        }
        savingsProductsService.edit(savingsProductDto);
        return "redirect:/savings-products";
    }

    @PostMapping(value = "/savings-products/delete")
    public String deleteSavingsProduct(@RequestParam("id") Long id) {
        savingsProductsService.delete(id);
        return "redirect:/savings-products";
    }
}
