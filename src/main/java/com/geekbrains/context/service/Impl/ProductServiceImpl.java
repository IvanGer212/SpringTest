package com.geekbrains.context.service.Impl;

import com.geekbrains.context.domain.Product;
import com.geekbrains.context.repository.ProductRepository;
import com.geekbrains.context.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }
}
