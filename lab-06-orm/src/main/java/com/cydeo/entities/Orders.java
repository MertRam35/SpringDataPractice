package com.cydeo.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

public class Orders {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Double paidPrice;
    private Double totalPrice;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;

    public Orders(Double paidPrice, Double totalPrice) {
        this.paidPrice = paidPrice;
        this.totalPrice = totalPrice;
    }
}
