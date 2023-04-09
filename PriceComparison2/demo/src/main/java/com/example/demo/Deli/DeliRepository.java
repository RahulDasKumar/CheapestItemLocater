package com.example.demo.Deli;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliRepository extends JpaRepository<Deli,String> {
    Deli findPriceByName(String name);
    Deli findStoreByName(String name);
    Deli findUrlByName(String name);
}
