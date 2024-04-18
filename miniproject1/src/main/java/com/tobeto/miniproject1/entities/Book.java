package com.tobeto.miniproject1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books") // snake_case
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id") // hangi kolon ile eşleşeceğini belirlerim
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "page_count")
    private int pageCount;  // camel-case

    @Column(name = "isbn")
    private String isbn;


}

// isimler bire bir aynı olacaksa @Column anatasyonuna ihtiyacım yoktur.