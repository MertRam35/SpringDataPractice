package com.cydeo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private Double price;
    private Integer quantity;
    private Integer remainingQuantity;

    @ManyToMany()
    @JoinTable(name = "product_category_rel",joinColumns = {@JoinColumn(name = "pId")},inverseJoinColumns = {@JoinColumn(name = "cId")})
    private List<Category> categoryList;

    public Product(String name, Double price, Integer quantity, Integer remainingQuantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.remainingQuantity = remainingQuantity;
    }
}
