package com.example.demo.Deli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliService {

        private final DeliRepository deliRepository;
        @Autowired
        public DeliService(DeliRepository deliRepository) {
            this.deliRepository = deliRepository;
        }

        //@GetMapping
        public List<Deli> getDeli(){
            return deliRepository.findAll();

        }
        public double findPrice(String name){
            return deliRepository.findPriceByName(name).getPrice();
        }
        public String findSource(String name){
            return deliRepository.findStoreByName(name).getSources();
        }

        public String findUrl(String name) {
            return deliRepository.findUrlByName(name).getLink();
        }


}
