package com.example.demo.Vegetables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class VegetablePriceUpdater {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Scheduled(cron = "0 0 0 ? * THU *")
    public void findCheapestVegetableProducts() throws IOException, URISyntaxException, InterruptedException {
        Vegetable Broccoli = new Vegetable("Broccoli", vegetableRepository.findPriceByName("Broccoli").getPrice(), vegetableRepository.findStoreByName("Broccoli").getSources(), vegetableRepository.findUrlByName("Broccoli").getLink());
        Broccoli.findCheapestItem(Broccoli.getName());
        Vegetable BrusselsSprouts = new Vegetable("Brussels-sprouts", vegetableRepository.findPriceByName("Brussels-sprouts").getPrice(), vegetableRepository.findStoreByName("Brussels-sprouts").getSources(), vegetableRepository.findUrlByName("Brussels-sprouts").getLink());
        BrusselsSprouts.findCheapestItem(BrusselsSprouts.getName());
        Vegetable Carrots = new Vegetable("Carrots", vegetableRepository.findPriceByName("Carrots").getPrice(), vegetableRepository.findStoreByName("Carrots").getSources(), vegetableRepository.findUrlByName("Carrots").getLink());
        Carrots.findCheapestItem(Carrots.getName());
        Vegetable GreenBeans = new Vegetable("Green-beans", vegetableRepository.findPriceByName("Green-beans").getPrice(), vegetableRepository.findStoreByName("Green-beans").getSources(), vegetableRepository.findUrlByName("Green-beans").getLink());
        GreenBeans.findCheapestItem(GreenBeans.getName());
        Vegetable Spinach = new Vegetable("Spinach", vegetableRepository.findPriceByName("Spinach").getPrice(), vegetableRepository.findStoreByName("Spinach").getSources(), vegetableRepository.findUrlByName("Spinach").getLink());
        Spinach.findCheapestItem(Spinach.getName());
        Vegetable Squash = new Vegetable("Squash", vegetableRepository.findPriceByName("Squash").getPrice(), vegetableRepository.findStoreByName("Squash").getSources(), vegetableRepository.findUrlByName("Squash").getLink());
        Squash.findCheapestItem(Squash.getName());
        vegetableRepository.saveAll(List.of(Broccoli,BrusselsSprouts,Carrots,GreenBeans,Spinach,Squash));
    }
}
