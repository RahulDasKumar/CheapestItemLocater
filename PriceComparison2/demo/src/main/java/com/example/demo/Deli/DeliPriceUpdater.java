package com.example.demo.Deli;

import com.example.demo.Fruit.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class DeliPriceUpdater {

    @Autowired
    private DeliRepository deliRepository;


    @Scheduled(cron = "0 0 0 * * TUE")
    public void findCheapestDeliProducts() throws IOException, URISyntaxException, InterruptedException {
        Deli Chicken = new Deli("Chicken", deliRepository.findPriceByName("Chicken").getPrice(), deliRepository.findStoreByName("Chicken").getSources(), deliRepository.findUrlByName("Chicken").getLink());
        Chicken.findCheapestItem(Chicken.getName());
        Deli Beef = new Deli("Beef", deliRepository.findPriceByName("Beef").getPrice(), deliRepository.findStoreByName("Beef").getSources(), deliRepository.findUrlByName("Beef").getLink());
        Beef.findCheapestItem(Beef.getName());
        Deli Pork = new Deli("Pork", deliRepository.findPriceByName("Pork").getPrice(), deliRepository.findStoreByName("Pork").getSources(), deliRepository.findUrlByName("Pork").getLink());
        Pork.findCheapestItem(Pork.getName());
        Deli Salmon = new Deli("Salmon", deliRepository.findPriceByName("Salmon").getPrice(), deliRepository.findStoreByName("Salmon").getSources(), deliRepository.findUrlByName("Salmon").getLink());
        Salmon.findCheapestItem(Salmon.getName());
        Deli Ham = new Deli("Ham", deliRepository.findPriceByName("Ham").getPrice(), deliRepository.findStoreByName("Ham").getSources(), deliRepository.findUrlByName("Ham").getLink());
        Ham.findCheapestItem(Ham.getName());
        Deli Turkey = new Deli("Turkey", deliRepository.findPriceByName("Turkey").getPrice(), deliRepository.findStoreByName("Turkey").getSources(), deliRepository.findUrlByName("Turkey").getLink());
        Turkey.findCheapestItem(Turkey.getName());
        deliRepository.saveAll(List.of(Chicken,Beef,Pork,Salmon,Ham,Turkey));
    }
}
