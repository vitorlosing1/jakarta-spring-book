package br.com.appfinance.services;

import br.com.appfinance.domain.Book;
import br.com.appfinance.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List <Book> findAll() {
        return bookRepository.findAll();
    }

    public void delete (Integer idBook) {
        Book book = bookRepository.findById(idBook).get();
        bookRepository.delete(book);
    }

    public void insert (Book book) {
        bookRepository.save(book);
    }

    public void save(Book book) {
        bookRepository.save(book);
    }
}