package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankOfSimbaController {

    private List<BankAccount> accounts;

    public BankOfSimbaController() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Bela", "Monkey", 350.3555, "g"));
        accounts.add(new BankAccount("Tomi", "Seadog", 18000000., "b"));
        accounts.add(new BankAccount("Pumba", "Malac", 0.23333, "g"));
        accounts.add(new BankAccount("Sol", "Lion", 9999999., "b"));
        accounts.get(2).setKing(true);
    }

    @GetMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("firstAcc", accounts.get(0));
        return "index";
    }

    @GetMapping("/HTMLception")
    public String htmlception(Model model) {
        model.addAttribute("htmlception", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @GetMapping("/accounts")
    public String accountTable(Model model, @ModelAttribute BankAccount bankAccount) {
        model.addAttribute("accounts", accounts);
        model.addAttribute("singleAcc", bankAccount);
        return "accountTable";
    }


    @PostMapping("/add")
    public String addAcc(@ModelAttribute("singleAcc") BankAccount bankAccount) {
        accounts.add(bankAccount);
        return "redirect:/accounts";
    }

    @PostMapping("/accounts")
    public String increase(@ModelAttribute(name = "accName") String name) {
        topUp(name);
        return "redirect:/accounts";
    }

    public void topUp(String name) {
        for (BankAccount account : accounts) {
            if (name.equals(account.getName()) && (account.isKing())) {
                account.setBalance(account.getBalance() + 100);
            } else if (name.equals(account.getName())) {
                account.setBalance(account.getBalance() + 10);
            }
        }
    }
}
