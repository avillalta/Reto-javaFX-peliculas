package org.example.retopeliculasjavafx.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", length = 155)
    private String title;

    @Column(name = "genre", length = 50)
    private String genre;

    @Column(name = "year")
    private Integer year;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "director", length = 50)
    private String director;

}