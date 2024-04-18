package com.tobeto.miniproject1.controller;

import com.tobeto.miniproject1.entities.Book;
import com.tobeto.miniproject1.service.abstracts.BookService;
import com.tobeto.miniproject1.service.dtos.request.book.CreateBookRequest;
import com.tobeto.miniproject1.service.dtos.responses.book.ListBookResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private BookService bookService; // bağımlılık

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void add(@RequestParam CreateBookRequest request)
    {
        bookService.add(request);
    }

    @GetMapping
    public List<ListBookResponse> getAll()
    {
       return bookService.getAll();
    }

    @GetMapping("{id}")
    public Book getById(@RequestParam int id)
    {
        return bookService.getById(id);
    }
}
