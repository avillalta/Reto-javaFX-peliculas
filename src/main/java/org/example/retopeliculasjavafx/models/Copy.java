package org.example.retopeliculasjavafx.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Copies")
public class Copy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "copy_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private org.example.retopeliculasjavafx.models.Movie movie;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @Lob
    @Column(name = "format", nullable = false)
    private String format;

}