package com.eyox.reacttutorialapi.business.abstracts;

import com.eyox.reacttutorialapi.entities.abstacts.Product;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProductService {
    List<Product> getAll();
}
