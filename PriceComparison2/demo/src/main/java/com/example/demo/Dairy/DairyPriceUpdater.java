package com.example.demo.Dairy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class DairyPriceUpdater {

    @Autowired
    private DairyRepository dairyRepository;


    @Scheduled(cron = "0 0 0 ? * WED *")
    public void findDairyProducts() throws IOException, URISyntaxException, InterruptedException {
        Dairy Milk = new Dairy("Milk", dairyRepository.findPriceByName("Milk").getPrice(), dairyRepository.findStoreByName("Milk").getSources(), dairyRepository.findUrlByName("Milk").getLink());
        Milk.findCheapestItem(Milk.getName());
        Dairy Yogurt = new Dairy("Yogurt", dairyRepository.findPriceByName("Yogurt").getPrice(), dairyRepository.findStoreByName("Yogurt").getSources(), dairyRepository.findUrlByName("Yogurt").getLink());
        Yogurt.findCheapestItem(Yogurt.getName());
        Dairy Cheese = new Dairy("Cheese", dairyRepository.findPriceByName("Cheese").getPrice(), dairyRepository.findStoreByName("Cheese").getSources(), dairyRepository.findUrlByName("Cheese").getLink());
        Cheese.findCheapestItem(Cheese.getName());
        Dairy SourCream = new Dairy("Sour-cream", dairyRepository.findPriceByName("Sour-cream").getPrice(), dairyRepository.findStoreByName("Sour-cream").getSources(), dairyRepository.findUrlByName("Sour-cream").getLink());
        SourCream.findCheapestItem(SourCream.getName());
        Dairy Butter = new Dairy("Butter", dairyRepository.findPriceByName("Butter").getPrice(), dairyRepository.findStoreByName("Butter").getSources(), dairyRepository.findUrlByName("Butter").getLink());
        Butter.findCheapestItem(Butter.getName());
        Dairy AlmondMilk = new Dairy("Almond-milk", dairyRepository.findPriceByName("Almond-milk").getPrice(), dairyRepository.findStoreByName("Almond-milk").getSources(), dairyRepository.findUrlByName("Almond-milk").getLink());
        AlmondMilk.findCheapestItem(AlmondMilk.getName());
        dairyRepository.saveAll(List.of(Milk,Yogurt,Cheese,SourCream,Butter,AlmondMilk));
    }


}
