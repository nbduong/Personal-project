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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @Column(columnDefinition = "varchar(250)")
    String name;

    @Column(columnDefinition = "varchar(50)")
    String username;

    @Column(columnDefinition = "varchar(32)")
    String password;

    @Column(columnDefinition = "varchar(500)")
    String address;

    @Column(columnDefinition = "varchar(150)")
    String email;

    @Column(columnDefinition = "varchar(50)")
    String phone;

    @Column(columnDefinition = "varchar(250)")
    String avatar;

    @Column(columnDefinition = "datetime")
    private LocalDateTime createdDate;

    @Column(columnDefinition = "datetime")
    private LocalDateTime updatedDate;

    @Column(columnDefinition = "bigint")
    private Integer createdBy;

    @Column(columnDefinition = "bigint")
    private Integer updatedBy;

    @Column(columnDefinition = "tinyint")
    private Integer is_delete = 0;

    @Column(columnDefinition = "tinyint")
    private Integer is_active = 1;
}
