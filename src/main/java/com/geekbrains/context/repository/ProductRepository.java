package com.geekbrains.context.repository;

import com.geekbrains.context.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<Product> findById(long id);

}
