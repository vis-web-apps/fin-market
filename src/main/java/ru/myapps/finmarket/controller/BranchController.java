package ru.myapps.finmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.myapps.finmarket.dto.BranchDto;
import ru.myapps.finmarket.service.BranchService;

@Controller
@RequiredArgsConstructor
public class BranchController {

    private final BranchService  branchService;

    @PostMapping(value = "/branches/create")
    public String createBank(@ModelAttribute("branchDto") BranchDto branchDto) {
        if (branchDto == null) {
            return "redirect:/banks";
        }
        branchService.create(branchDto);
        return "redirect:/banks";
    }

    @PostMapping(value = "/branches/edit")
    public String editBank(@ModelAttribute("branchDto") BranchDto branchDto) {
        if (branchDto == null) {
            return "redirect:/banks";
        }
        branchService.edit(branchDto);
        return "redirect:/banks";
    }

    @PostMapping(value = "/branches/delete")
    public String deleteBank(@RequestParam("id") Long id) {
        branchService.delete(id);
        return "redirect:/banks";
    }

}
