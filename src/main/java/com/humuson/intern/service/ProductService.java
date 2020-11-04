package com.humuson.intern.service;

import com.humuson.intern.dao.ProductDao;
import com.humuson.intern.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getProducts() {
        return productDao.getProducts();
    }
}
