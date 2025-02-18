package com.springKomaru.SpringByKomaru.controllers;
// Комару?

import com.springKomaru.SpringByKomaru.services.shoppingCartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class shoppingCartController {
    private final shoppingCartServices shoppingCartServices;

    @Autowired
    public shoppingCartController(final shoppingCartServices shoppingCartServices) {
        this.shoppingCartServices = shoppingCartServices;
    }

    @GetMapping(path="/add")
    public String addItems(@RequestParam(value="item") List<Integer> items) {
        this.shoppingCartServices.addItems(items);
        return "Successful added products id to list";
    }

    @GetMapping(path="/get")
    public List<Integer> getItems() {
        return shoppingCartServices.getItems();
    }
}
