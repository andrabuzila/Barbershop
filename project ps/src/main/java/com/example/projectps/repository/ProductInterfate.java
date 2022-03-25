package com.example.projectps.repository;

import com.example.projectps.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductInterfate extends CrudRepository<Product, Integer> {

}
