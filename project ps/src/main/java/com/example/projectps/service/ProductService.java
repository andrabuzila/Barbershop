package com.example.projectps.service;

import com.example.projectps.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    public Product addProduct(Product product);
    public void deleteByIdProduct(int idproduct);
}
