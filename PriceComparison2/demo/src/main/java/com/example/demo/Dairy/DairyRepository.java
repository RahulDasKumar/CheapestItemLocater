package com.example.demo.Dairy;

import com.example.demo.Vegetables.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DairyRepository extends JpaRepository<Dairy, String> {
    Dairy findPriceByName(String name);
    Dairy findStoreByName(String name);

    Dairy findUrlByName(String name);
}
