package com.example.demo;

import com.example.demo.Dairy.Dairy;
import com.example.demo.Dairy.DairyService;
import com.example.demo.Deli.Deli;
import com.example.demo.Deli.DeliService;
import com.example.demo.Fruit.Fruit;
import com.example.demo.Fruit.ItemService;
import com.example.demo.Vegetables.Vegetable;
import com.example.demo.Vegetables.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/info")
public class ItemController {

    private final ItemService itemService;

    private final VegetableService vegetableService;

    private final DairyService dairyService;

    private final DeliService deliService;


    @Autowired
    public ItemController(ItemService itemService,VegetableService vegetableService,DairyService dairyService, DeliService deliService) {
        this.itemService = itemService;
        this.vegetableService = vegetableService;
        this.dairyService = dairyService;
        this.deliService = deliService;
    }



    @GetMapping(path = "/fruit")
    public List<Fruit> getFruits(){
        return itemService.getItem();
    }


    @GetMapping(path="/vegetable")
    public List<Vegetable> getVegetables(){
        return vegetableService.getVegetables();
    }

    @GetMapping(path = "/dairy")
    public List<Dairy> getDairyProducts(){
        return dairyService.getDairy();
    }


    @GetMapping(path="/deli")
    public List<Deli> getDeliProducts(){
        return deliService.getDeli();
    }





}
