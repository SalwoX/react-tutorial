package com.eyox.reacttutorialapi.business.concretes;

import com.eyox.reacttutorialapi.business.abstracts.ProductService;
import com.eyox.reacttutorialapi.core.utilities.results.DataResult;
import com.eyox.reacttutorialapi.core.utilities.results.Result;
import com.eyox.reacttutorialapi.core.utilities.results.SuccessDataResult;
import com.eyox.reacttutorialapi.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi!");
    }
}
