package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.BankDto;
import ru.myapps.finmarket.service.BankService;

@Controller
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @GetMapping(value = "/banks")
    public String getBanks(@RequestParam(required = false) String query, Model model) {

        model.addAttribute("banks", bankService.getAllBanks());
        model.addAttribute("query", query);

        return "banks";
    }

    @PostMapping(value = "/banks/create")
    public String createBank(@ModelAttribute("bankDto") BankDto bankDto) {
        if (bankDto == null) {
            return "redirect:/banks";
        }
        bankService.create(bankDto);
        return "redirect:/banks";
    }

    @PostMapping(value = "/banks/edit")
    public String editBank(@ModelAttribute("bankDto") BankDto bankDto) {
        if (bankDto == null) {
            return "redirect:/banks";
        }
        bankService.edit(bankDto);
        return "redirect:/banks";
    }

    @PostMapping(value = "/banks/delete")
    public String deleteBank(@RequestParam("id") Long id) {
        bankService.delete(id);
        return "redirect:/banks";
    }
}
