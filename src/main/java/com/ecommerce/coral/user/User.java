package com.ecommerce.coral.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String email;

    private String password;

}