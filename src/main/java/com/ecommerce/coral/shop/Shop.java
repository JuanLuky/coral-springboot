package com.ecommerce.coral.shop;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_products")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String image;
    private Float price;
    private String brand;
}
