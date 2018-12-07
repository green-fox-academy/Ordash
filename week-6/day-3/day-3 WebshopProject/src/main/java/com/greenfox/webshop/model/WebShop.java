package com.greenfox.webshop.model;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<ShopItem> itemList;

    public WebShop() {
        itemList = new ArrayList<>();
        itemList.add(new ShopItem("Hajdu mosogep", "Rozsdas de mos", 1500,5));
        itemList.add(new ShopItem("WC kefe", "Alig hasznalt", 10000,15));
        itemList.add(new ShopItem("Nike cipo","lukas",500,20));
        itemList.add(new ShopItem("Rotacios kapa", "nem mukodik", 100, 2));
        itemList.add(new ShopItem("Szurke polo", "fako", 100, 0));
    }


    public List<ShopItem> getItemList() {
        return itemList;
    }
}
