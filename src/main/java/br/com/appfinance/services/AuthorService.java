package br.com.appfinance.services;

import br.com.appfinance.domain.Author;
import br.com.appfinance.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List <Author> findAll() {

    return authorRepository.findAll();
    }
}
