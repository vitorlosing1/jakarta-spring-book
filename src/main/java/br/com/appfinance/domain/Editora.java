package br.com.appfinance.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String nameFantasy;

    @OneToMany(mappedBy = "editora")
    List<Book> bookList = new ArrayList<>();

}
