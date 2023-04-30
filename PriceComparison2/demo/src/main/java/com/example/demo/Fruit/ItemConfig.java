package com.example.demo.Fruit;

import com.example.demo.Fruit.Fruit;
import com.example.demo.Fruit.FruitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//@Configuration
//public class ItemConfig {
//    /**
//     * For the commented out code, next implementation will be about using crone expressions for the findCheapestItem
//     * function
//     */
//
//
//    @Bean
//    CommandLineRunner commandLineRunner(FruitRepository itemRepository){
//        return args -> {
//                Fruit banana = new Fruit("banana",itemRepository.findPriceByName("banana").getPrice() ,itemRepository.findStoreByName("banana").getSources(),itemRepository.findUrlByName("banana").getLink());
//                banana.findCheapestItem(banana.getName());
//                Fruit apple = new Fruit("apple",itemRepository.findPriceByName("apple").getPrice(),itemRepository.findStoreByName("apple").getSources(),itemRepository.findUrlByName("apple").getLink());
//                apple.findCheapestItem(apple.getName());
//                Fruit grapes = new Fruit("grapes",itemRepository.findPriceByName("grapes").getPrice(),itemRepository.findStoreByName("grapes").getSources(),itemRepository.findUrlByName("grapes").getLink());
//                grapes.findCheapestItem(grapes.getName());
//                Fruit watermelon = new Fruit("watermelon",itemRepository.findPriceByName("watermelon").getPrice(),itemRepository.findStoreByName("watermelon").getSources(),itemRepository.findUrlByName("watermelon").getLink());
//                watermelon.findCheapestItem(watermelon.getName());
//                Fruit kiwi = new Fruit("kiwi",itemRepository.findPriceByName("kiwi").getPrice(),itemRepository.findStoreByName("kiwi").getSources(),itemRepository.findUrlByName("kiwi").getLink());
//                kiwi.findCheapestItem(kiwi.getName());
//                Fruit pineapple = new Fruit("pineapple",itemRepository.findPriceByName("pineapple").getPrice(),itemRepository.findStoreByName("pineapple").getSources(),itemRepository.findUrlByName("pineapple").getLink());
//                pineapple.findCheapestItem(pineapple.getName());
//            itemRepository.saveAll(List.of(apple,banana,grapes,watermelon,kiwi,pineapple));
//        };
//    }
//}
