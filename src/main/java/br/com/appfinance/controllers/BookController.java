package br.com.appfinance.controllers;

import br.com.appfinance.domain.Author;
import br.com.appfinance.domain.Book;
import br.com.appfinance.services.BookService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorController authorController;

    List<Book> bookList;

    private Book book;

    @PostConstruct
    public List<Book> findAll() {
        return bookList = bookService.findAll();
    }

    public void save() {
        bookService.save(book);
        findAll();
        resetBook();
    }

    public void edit(Book selectedBook) {
        this.book = selectedBook;
    }

    public void delete(Book selectedBook) {
        bookService.delete(selectedBook.getId());
        findAll();
    }

    public void resetBook() {
        this.book = new Book();
        this.book.setAuthor(new Author());
    }
}