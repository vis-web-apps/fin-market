package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.PromoDto;
import ru.myapps.finmarket.service.BankService;
import ru.myapps.finmarket.service.PromoService;

@Controller
@RequiredArgsConstructor
public class PromoController {

    private final PromoService promoService;
    private final BankService bankService;

    @GetMapping(value = "/promo")
    public String getPromo(Model model) {

        model.addAttribute("promos", promoService.getAllPromos());
        model.addAttribute("banks", bankService.getAllBanks());

        return "promo";
    }

    @PostMapping(value = "/promo/create")
    public String createPromo(@ModelAttribute("promoDto") PromoDto promoDto) {
        if (promoDto == null) {
            return "redirect:/promo";
        }
        promoService.create(promoDto);
        return "redirect:/promo";
    }

    @PostMapping(value = "/promo/edit")
    public String editPromo(@ModelAttribute("promoDto")  PromoDto promoDto) {
        if (promoDto == null) {
            return "redirect:/promo";
        }
        promoService.edit(promoDto);
        return "redirect:/promo";
    }

    @PostMapping(value = "/promo/delete")
    public String deletePromo(@RequestParam("id") Long id) {
        promoService.delete(id);
        return "redirect:/promo";
    }
}
