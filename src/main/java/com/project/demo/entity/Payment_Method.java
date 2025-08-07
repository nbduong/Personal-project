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
public class Payment_Method {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint")
    Long id;

    @Column(columnDefinition = "varchar(250)")
    String name;

    @Column(columnDefinition = "text")
    String notes;

    @Column(columnDefinition = "datetime")
    private LocalDateTime createdDate;

    @Column(columnDefinition = "datetime")
    private LocalDateTime updatedDate;

    @Column(columnDefinition = "tinyint")
    private Integer is_delete = 0;

    @Column(columnDefinition = "tinyint")
    private Integer is_active = 1;
}
