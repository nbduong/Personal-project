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
public class News_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    private Long Id;

    @Column(columnDefinition = "varchar(500)")
    private String name;

    @Column(columnDefinition = "text")
    private String notes;

    @Column(columnDefinition = "varchar(250)")
    private String icon;

    @Column(columnDefinition = "bigint")
    private String idParent;

    @Column(columnDefinition = "tinyint")
    private String type;

    @Column(columnDefinition = "varchar(160)")
    private String slug;

    @Column(columnDefinition = "varchar(100)")
    private String meta_title;

    @Column(columnDefinition = "varchar(300)")
    private String meta_description;

    @Column(columnDefinition = "varchar(300)")
    private String meta_keyword;

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
