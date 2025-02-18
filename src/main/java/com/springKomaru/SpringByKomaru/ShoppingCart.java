package com.springKomaru.SpringByKomaru;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(List<Integer> itemIds) {
        this.items.addAll(itemIds);
    }

    public List<Integer> getItems() {
        return this.items;
    }
}
