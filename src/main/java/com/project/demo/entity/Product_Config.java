package com.project.demo.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product_Config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, columnDefinition = "bigint")
    Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "config_id", nullable = false, columnDefinition = "bigint")
    Configurations configurations;

    @Column(columnDefinition = "text")
    String value;

}
