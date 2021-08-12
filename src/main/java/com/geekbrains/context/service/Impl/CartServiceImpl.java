package com.geekbrains.context.service.Impl;

import com.geekbrains.context.domain.Product;
import com.geekbrains.context.service.CartService;
import com.geekbrains.context.service.ProductService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class CartServiceImpl implements CartService {

    private final ProductService productService;

    private final List<Product> products;

    public CartServiceImpl(ProductService productService, List<Product> products) {
        this.productService = productService;
        this.products = products;
    }

    @Override
    public boolean addProduct(long id) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            products.add(productOptional.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeProduct(long id) {
      //  Optional<Product> productOptional = productService.findById(id);
        return products.removeIf(product -> product.getId() == id);
//        if (productOptional.isPresent()){
//            products.remove(productOptional.get());
//            return true;
//        }
//        return false;
    }
}
