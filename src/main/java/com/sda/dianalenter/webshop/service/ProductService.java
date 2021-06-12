package com.sda.dianalenter.webshop.service;

import com.sda.dianalenter.webshop.model.Product;
import com.sda.dianalenter.webshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Transactional
    public void save(Product product){
        productRepository.save(product);
    }
    public List<Product> findAll(){

        //return new ArrayList<Product>((Collection<? extends Product>) productRepository.findAll());
        return StreamSupport.stream(productRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
