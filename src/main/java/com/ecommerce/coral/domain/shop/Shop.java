package com.ecommerce.coral.domain.shop;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "ecommerce")
@Entity(name = "ecommerce")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String image;
    private Float price;
    private String brand;
}
