package com.sda.dianalenter.webshop.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(min = 5, max = 50)
    @Column(name = "name")
    private String name;

    @NotBlank
    @Size(min = 5, max = 500)
    @Column(name = "description")
    private String description;

    @Positive
    @Column(name = "price")
    private Double price;

    @NotBlank
    @Pattern(regexp = "[A-Z][A-Z][A-Z]")
    @Column(name = "currency")
    private String currency;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ProductCategory category;

    public Product(String name, String description, Double price, String currency, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.category = category;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", category=" + category +
                '}';
    }
}
