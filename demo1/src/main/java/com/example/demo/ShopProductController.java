package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShopProductController {
    @GetMapping("/shop/product-single")
    public String productDetail() {
        return "product-single";
    }
}
