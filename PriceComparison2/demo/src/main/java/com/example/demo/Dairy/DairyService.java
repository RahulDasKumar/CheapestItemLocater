package com.example.demo.Dairy;

import com.example.demo.Vegetables.Vegetable;
import com.example.demo.Vegetables.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DairyService {
    private final DairyRepository dairyRepository;
    @Autowired
    public DairyService(DairyRepository dairyRepository) {
        this.dairyRepository = dairyRepository;
    }

    public List<Dairy> getVegetables(){
        return dairyRepository.findAll();
    }
}
