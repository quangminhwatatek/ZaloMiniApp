package com.example.zalominiapp.miniapp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "Products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;

    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @ManyToMany
    @JoinTable(
            name = "ProductCategories",
            joinColumns = @JoinColumn(name = "ProductID"),
            inverseJoinColumns = @JoinColumn(name = "CategoryID"))
    private List<Category> categories;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}
