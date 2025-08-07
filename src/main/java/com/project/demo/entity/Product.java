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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @Column(columnDefinition = "varchar(500)")
    String name;

    @Column(columnDefinition = "text")
    String description;

    @Column(columnDefinition = "text")
    String notes;

    @Column(columnDefinition = "varchar(550)")
    String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, columnDefinition = "bigint")
    Category category;

    @Column(columnDefinition = "text")
    String contents;

    @Column(columnDefinition = "DECIMAL")
    Long price = 0L;

    @Column(columnDefinition = "INT")
    Integer quantity = 0;

    @Column(columnDefinition = "varchar(160)")
    String slug;

    @Column(columnDefinition = "varchar(100)")
    String meta_title;

    @Column(columnDefinition = "varchar(300)")
    String meta_description;

    @Column(columnDefinition = "varchar(300)")
    String meta_keyword;

    @Column(columnDefinition = "datetime")
    LocalDateTime createdDate;

    @Column(columnDefinition = "datetime")
    LocalDateTime updatedDate;

    @Column(columnDefinition = "bigint")
    Integer createdBy;

    @Column(columnDefinition = "bigint")
    Integer updatedBy;

    @Column(columnDefinition = "tinyint")
    Integer is_delete = 0;

    @Column(columnDefinition = "tinyint")
    Integer is_active = 1;
}
