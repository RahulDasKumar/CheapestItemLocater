package com.example.demo.Fruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,String> {
    Item findPriceByName(String name);
    Item findStoreByName(String name);

    Item findUrlByName(String name);
}