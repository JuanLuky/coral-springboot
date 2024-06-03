package com.ecommerce.coral.controller;

import com.ecommerce.coral.user.User;
import com.ecommerce.coral.user.UserRepository;
import com.ecommerce.coral.shop.Shop;
import com.ecommerce.coral.shop.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ShopController {

    private final ShopRepository shopRepository;
    private final UserRepository userRepository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/v1/shops") // Specify a unique path for shops
    public @ResponseBody List<Shop> getShops() {
        return shopRepository.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/v1/users") // Specify a unique path for users
    public @ResponseBody List<User> getUsers() {
        return userRepository.findAll();
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/v1") // No need to specify a path here
    public ResponseEntity<Map<String, Object>> getAll() {
        List<Shop> shops = shopRepository.findAll();
        List<User> users = userRepository.findAll();
        Map<String, Object> response = new HashMap<>();
        response.put("shops", shops);
        response.put("users", users);
        return ResponseEntity.ok(response);
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Shop saveProduct(@RequestBody Shop data) {
        return shopRepository.save( data );
    }

}

