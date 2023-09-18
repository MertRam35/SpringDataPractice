package com.cydeo.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

    public Address(String name, String street, String zipCode) {
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
    }
}
