package com.example.demo.Deli;

import com.example.demo.Dairy.Dairy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DeliConfig {



    @Bean
    CommandLineRunner DeliItemUpdater(DeliRepository deliRepository) {
        return args -> {
            Deli Chicken = new Deli("Chicken", deliRepository.findPriceByName("Chicken").getPrice(), deliRepository.findStoreByName("Chicken").getSources(), deliRepository.findUrlByName("Chicken").getLink());
            //Chicken.findCheapestItem(Chicken.getName());
            Deli Beef = new Deli("Beef", deliRepository.findPriceByName("Beef").getPrice(), deliRepository.findStoreByName("Beef").getSources(), deliRepository.findUrlByName("Beef").getLink());
            //Beef.findCheapestItem(Beef.getName());
            Deli Pork = new Deli("Pork", deliRepository.findPriceByName("Pork").getPrice(), deliRepository.findStoreByName("Pork").getSources(), deliRepository.findUrlByName("Pork").getLink());
            //Pork.findCheapestItem(Pork.getName());
            Deli Salmon = new Deli("Salmon", deliRepository.findPriceByName("Salmon").getPrice(), deliRepository.findStoreByName("Salmon").getSources(), deliRepository.findUrlByName("Salmon").getLink());
            //Salmon.findCheapestItem(Salmon.getName());
            Deli Ham = new Deli("Ham", deliRepository.findPriceByName("Ham").getPrice(), deliRepository.findStoreByName("Ham").getSources(), deliRepository.findUrlByName("Ham").getLink());
            //Ham.findCheapestItem(Ham.getName());
            Deli Turkey = new Deli("Turkey", deliRepository.findPriceByName("Turkey").getPrice(), deliRepository.findStoreByName("Turkey").getSources(), deliRepository.findUrlByName("Turkey").getLink());
            //Turkey.findCheapestItem(Turkey.getName());
            deliRepository.saveAll(List.of(Chicken,Beef,Pork,Salmon,Ham,Turkey));
        };


    }
}
