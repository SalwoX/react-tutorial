package com.eyox.reacttutorialapi.business.abstracts;

import com.eyox.reacttutorialapi.core.utilities.results.DataResult;
import com.eyox.reacttutorialapi.core.utilities.results.Result;
import com.eyox.reacttutorialapi.entities.abstacts.Product;

import java.util.List;
public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
