package br.com.appfinance.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "idAuthor")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "idEditora")
    private  Editora editora;

    private LocalDateTime publication;

}
