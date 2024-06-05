package com.chaechae.project1.Controller;

import com.chaechae.project1.Model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();

    @GetMapping("/get")
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}
