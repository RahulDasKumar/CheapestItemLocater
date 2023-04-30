package com.example.demo.Fruit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
    private final FruitRepository itemRepository;

    @Autowired
    public ItemService(FruitRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    //@GetMapping
    public List<Fruit> getItem(){
        return
                itemRepository.findAll();

    }
    public double findPrice(String name){
       return itemRepository.findPriceByName(name).getPrice();
    }
    public String findSource(String name){
        return itemRepository.findStoreByName(name).getSources();
    }

    public String findUrl(String name) {
        return itemRepository.findUrlByName(name).getLink();
    }

}
// new Item("bannana",9,"walmart");