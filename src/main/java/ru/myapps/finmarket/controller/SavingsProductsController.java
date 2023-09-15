package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.myapps.finmarket.service.SavingsProductsService;

@Controller
@RequiredArgsConstructor
public class SavingsProductsController {

    private final SavingsProductsService savingsProductsService;

    @GetMapping(value = "/savings-products")
    public String getAllRates(Model model) {
        model.addAttribute("savingsProducts", savingsProductsService.getAllSavingsProducts());

        return "savings-products";
    }
}
