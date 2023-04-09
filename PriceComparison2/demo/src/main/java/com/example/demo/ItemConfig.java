package com.example.demo;

import com.example.demo.Fruit.Item;
import com.example.demo.Fruit.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {
    /**
     * For the commented out code, next implementation will be about using crone expressions for the findCheapestItem
     * function
     */


    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository){
        return args -> {
               Item banana = new Item("banana",itemRepository.findPriceByName("banana").getPrice() ,itemRepository.findStoreByName("banana").getSources(),itemRepository.findUrlByName("banana").getLink());
               //banana.setPrice(banana.findCheapestItem(banana.getName()));
                //banana.setLink(banana.getLink());
                Item apple = new Item("apple",itemRepository.findPriceByName("apple").getPrice(),itemRepository.findStoreByName("apple").getSources(),itemRepository.findUrlByName("apple").getLink());
                //apple.setPrice(apple.findCheapestItem(apple.getName()));
                 //apple.setLink(apple.getLink());
                Item grapes = new Item("grapes",itemRepository.findPriceByName("grapes").getPrice(),itemRepository.findStoreByName("grapes").getSources(),itemRepository.findUrlByName("grapes").getLink());
               // grapes.setPrice(grapes.findCheapestItem(grapes.getName()));
                //grapes.setLink(grapes.getLink());
                Item watermelon = new Item("watermelon",itemRepository.findPriceByName("watermelon").getPrice(),itemRepository.findStoreByName("watermelon").getSources(),itemRepository.findUrlByName("watermelon").getLink());
               //watermelon.setPrice(watermelon.findCheapestItem(watermelon.getName()));
               //watermelon.setLink(watermelon.getLink());
            Item kiwi = new Item("kiwi",itemRepository.findPriceByName("kiwi").getPrice(),itemRepository.findStoreByName("kiwi").getSources(),itemRepository.findUrlByName("kiwi").getLink());
            //kiwi.setPrice(kiwi.findCheapestItem(kiwi.getName()));
            //kiwi.setLink(kiwi.getLink());
             Item pineapple = new Item("pineapple",itemRepository.findPriceByName("pineapple").getPrice(),itemRepository.findStoreByName("pineapple").getSources(),itemRepository.findUrlByName("pineapple").getLink());
            //pineapple.setPrice(pineapple.findCheapestItem(pineapple.getName()));
            //pineapple.setLink(pineapple.getLink());
            itemRepository.saveAll(List.of(apple,banana,grapes,watermelon,kiwi,pineapple));
        };
    }
}
