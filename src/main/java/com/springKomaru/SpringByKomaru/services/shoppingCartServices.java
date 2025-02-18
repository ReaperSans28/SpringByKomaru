package com.springKomaru.SpringByKomaru.services;
// Комару.

import com.springKomaru.SpringByKomaru.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class shoppingCartServices {

    private final ShoppingCart shoppingCart;

    public shoppingCartServices(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addItems(List<Integer> ids){
        this.shoppingCart.addItem(ids);
    }

    public List<Integer> getItems(){
        return this.shoppingCart.getItems();
    }

}
