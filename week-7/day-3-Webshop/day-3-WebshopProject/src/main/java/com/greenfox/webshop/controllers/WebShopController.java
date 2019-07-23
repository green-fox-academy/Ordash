package com.greenfox.webshop.controllers;

import com.greenfox.webshop.model.ShopItem;
import com.greenfox.webshop.model.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class WebShopController {

    private WebShop webshop;

    @PostConstruct
    public void init() {
        webshop = new WebShop();
    }

    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("webShop", webshop.getItemList());
        return "shop";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("webShop", webshop.getItemList().stream()
                .filter(i -> i.getQuantity() != 0)
                .collect(Collectors.toList())
        );
        return "shop";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("webShop", webshop.getItemList().stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList())
        );
        return "shop";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("webShop", webshop.getItemList().stream()
                .filter(i -> i.getName().toLowerCase().contains("nike"))
                .collect(Collectors.toList())
        );
        return "shop";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("avg", ("Average: " + webshop.getItemList().stream()
                .mapToDouble(ShopItem::getQuantity).average().orElse(Double.NaN)
        ));
        return "shop";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("mostexp", ("Most expensive: " + webshop.getItemList().stream()
                .max(Comparator.comparing(ShopItem::getPrice)).get().getName()
        ));
        return "shop";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam("search") String name) {
        model.addAttribute("webShop", webshop.getItemList().stream()
                .filter(i -> i.getName().toLowerCase().contains(name.toLowerCase()) || i.getDescription().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList())
        );
        return "shop";
    }
}


