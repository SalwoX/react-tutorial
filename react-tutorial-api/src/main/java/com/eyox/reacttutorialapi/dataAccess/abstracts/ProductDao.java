package com.eyox.reacttutorialapi.dataAccess.abstracts;

import com.eyox.reacttutorialapi.entities.abstacts.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {


}
