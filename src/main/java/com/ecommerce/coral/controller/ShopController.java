package com.ecommerce.coral.controller;

import com.ecommerce.coral.domain.shop.Shop;
import com.ecommerce.coral.domain.shop.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shop")
@AllArgsConstructor
public class ShopController {

    private final ShopRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public @ResponseBody List<Shop> getAll() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Shop saveProduct(@RequestBody Shop data) {
        return repository.save( data );
    }

}
