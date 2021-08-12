package com.geekbrains.context.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {
    private final long id;
    private final String title;
    private final int cost;

    public Product(long id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
