package br.com.appfinance.controllers;

import br.com.appfinance.domain.Author;
import br.com.appfinance.services.AuthorService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class AuthorController {

    @Autowired
    AuthorService authorService;

    List<Author> authorList;

    private Author author;

    @PostConstruct
    public List <Author> findAll() {
        return authorList = authorService.findAll();

    }
}
