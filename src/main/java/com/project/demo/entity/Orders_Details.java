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
public class Orders_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ord_id", nullable = false, columnDefinition = "bigint")
    Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, columnDefinition = "bigint")
    Product product;

    @Column(columnDefinition = "decimal")
    Long price = 0L;

    @Column(columnDefinition = "int")
    Integer Qty = 0;

    @Column(columnDefinition = "decimal")
    Long total;

    @Column(columnDefinition = "int")
    Integer returnQt = 0;
}
