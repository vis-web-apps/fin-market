package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.CardProductDto;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.CardsProductsService;

@Controller
@RequiredArgsConstructor
public class CardsProductsController {

    private final CardsProductsService cardsProductsService;
    private final BankService bankService;

    @GetMapping(value = "/cards-products")
    public String getCardsProducts(Model model) {
        model.addAttribute("cardsProducts", cardsProductsService.getAllCardsProducts());
        model.addAttribute("banks", bankService.getAllBanks());

        return "cards-products";
    }

    @PostMapping(value = "/cards-products/create")
    public String createSavingsProduct(@ModelAttribute("cardProductDto") CardProductDto cardProductDto) {
        if (cardProductDto == null) {
            return "redirect:/cards-products";
        }
        cardsProductsService.create(cardProductDto);
        return "redirect:/cards-products";
    }

    @PostMapping(value = "/cards-products/edit")
    public String editSavingsProduct(@ModelAttribute("cardProductDto") CardProductDto cardProductDto) {
        if (cardProductDto == null) {
            return "redirect:/cards-products";
        }
        cardsProductsService.edit(cardProductDto);
        return "redirect:/cards-products";
    }

    @PostMapping(value = "/cards-products/delete")
    public String deleteSavingsProduct(@RequestParam("id") Long id) {
        cardsProductsService.delete(id);
        return "redirect:/cards-products";
    }
}
