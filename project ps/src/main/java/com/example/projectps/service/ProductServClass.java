package com.example.projectps.service;

import com.example.projectps.model.Product;
import com.example.projectps.repository.ProductInterfate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServClass implements ProductService{
    @Autowired
    ProductInterfate productI;

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productI.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productI.save(product);
    }

    @Override
    public void deleteByIdProduct(int idproduct) {
        productI.deleteById(idproduct);
    }
}
