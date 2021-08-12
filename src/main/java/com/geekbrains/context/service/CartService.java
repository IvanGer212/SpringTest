package com.geekbrains.context.service;

import org.springframework.stereotype.Service;

@Service
public interface CartService {

    boolean addProduct(long id);

    boolean removeProduct(long id);

}
