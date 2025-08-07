package com.project.demo.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @Column(columnDefinition = "char(10)")
    String ordersId;

    @Column(columnDefinition = "datetime")
    LocalDateTime ordersDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false, columnDefinition = "bigint")
    Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id", nullable = false, columnDefinition = "bigint")
    Payment_Method paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_id", nullable = false, columnDefinition = "bigint")
    Transport_Method transportMethod;

    @Column(columnDefinition = "decimal")
    Long totalMoney;

    @Column(columnDefinition = "text")
    String notes;

    @Column(columnDefinition = "varchar(250)")
    String nameReciver;

    @Column(columnDefinition = "varchar(500)")
    String address;

    @Column(columnDefinition = "varchar(150)")
    String email;

    @Column(columnDefinition = "varchar(50)")
    String phone;

    @Column(columnDefinition = "tinyint")
    Integer is_delete = 0;

    @Column(columnDefinition = "tinyint")
    Integer is_active = 1;
}
