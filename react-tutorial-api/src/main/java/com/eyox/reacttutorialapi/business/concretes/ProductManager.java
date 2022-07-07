package com.eyox.reacttutorialapi.business.concretes;

import com.eyox.reacttutorialapi.business.abstracts.ProductService;
import com.eyox.reacttutorialapi.dataAccess.abstracts.ProductDao;
import com.eyox.reacttutorialapi.entities.abstacts.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }



    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
