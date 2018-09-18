package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true) // like mutation

public class product {
    private String name;
    private String description;
    private int price;
}
