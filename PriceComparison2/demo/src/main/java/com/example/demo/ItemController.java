package com.example.demo;

import com.example.demo.Fruit.Item;
import com.example.demo.Fruit.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/info")
// change to api/v1/fruit-info
public class ItemController {

    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping(path = "/fruit")
    public List<Item> getFruits(){
        return itemService.getItem();
    }





}
