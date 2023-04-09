package com.example.demo.Vegetables;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable,String> {
    Vegetable findPriceByName(String name);
    Vegetable findStoreByName(String name);

    Vegetable findUrlByName(String name);
}
