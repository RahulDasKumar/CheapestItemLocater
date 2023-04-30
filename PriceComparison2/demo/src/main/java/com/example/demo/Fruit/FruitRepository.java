package com.example.demo.Fruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit,String> {
    Fruit findPriceByName(String name);
    Fruit findStoreByName(String name);

    Fruit findUrlByName(String name);
}
