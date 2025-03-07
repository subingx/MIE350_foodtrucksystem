package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "menu_items")
public class MenuItem {

    @Id
    @NotEmpty
    private String code;

    @NotEmpty
    private String name;

    @NotEmpty
    private Double price;

    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "truckId")
    private FoodTruck foodTruck;

    public MenuItem(String code, String name, Double price, Boolean isAvailable, FoodTruck foodTruck) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.foodTruck = foodTruck;
    }
}
