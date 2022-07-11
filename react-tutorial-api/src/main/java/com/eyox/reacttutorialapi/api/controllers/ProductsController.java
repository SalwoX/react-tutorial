package com.eyox.reacttutorialapi.api.controllers;

import com.eyox.reacttutorialapi.business.abstracts.ProductService;
import com.eyox.reacttutorialapi.core.utilities.results.DataResult;
import com.eyox.reacttutorialapi.core.utilities.results.Result;
import com.eyox.reacttutorialapi.entities.abstacts.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")


public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/")
    public DataResult<List<Product>> get() {
        return this.productService.getAll();
    }
    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
         return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }
}
