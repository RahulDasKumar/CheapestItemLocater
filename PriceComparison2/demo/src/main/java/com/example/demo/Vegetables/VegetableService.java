package com.example.demo.Vegetables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {
    private final VegetableRepository vegetableRepository;
    @Autowired
    public VegetableService(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    public List<Vegetable> getVegetables(){
        return vegetableRepository.findAll();
    }
}
