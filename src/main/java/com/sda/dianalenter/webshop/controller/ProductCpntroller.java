package com.sda.dianalenter.webshop.controller;


import com.sda.dianalenter.webshop.model.Product;
import com.sda.dianalenter.webshop.service.ProductService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductCpntroller {

    private final ProductService productService;

    public ProductCpntroller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return  productService.findAll();
    }

    @GetMapping("/products/{id}")
    public  Product getProductById(@PathVariable(value = "id") Long productId){
        Optional<Product> product = productService.findById(productId);
        if(product.isPresent()){
            return product.get();
        }
        throw new IllegalArgumentException();
    }

    @PostMapping("/products")
    public String createProduct(@RequestBody Product product){
         productService.save(product);
         return "Product saved";
    }

}
