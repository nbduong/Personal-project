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
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @Column(columnDefinition = "varchar(500)")
    String name;

    @Column(columnDefinition = "text")
    String description;

    @Column(columnDefinition = "varchar(550)")
    String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_category_id", nullable = false, columnDefinition = "bigint")
    News_Category news_category;

    @Column(columnDefinition = "text")
    String contents;

    @Column(columnDefinition = "INT")
    Integer totalView;

    @Column(columnDefinition = "varchar(500)")
    String linkUrl;

    @Column(columnDefinition = "TINYINT")
    Integer isHome;

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
    Long createdBy;

    @Column(columnDefinition = "bigint")
    Long updatedBy;

    @Column(columnDefinition = "tinyint")
    Integer is_delete = 0;

    @Column(columnDefinition = "tinyint")
    Integer is_active = 1;

    @Column(columnDefinition = "bigint")
    Long approveBy;
}
