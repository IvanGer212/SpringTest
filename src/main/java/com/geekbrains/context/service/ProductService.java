package com.geekbrains.context.service;

import com.geekbrains.context.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    List<Product> getAll();

    Optional<Product> findById(long id);
}
