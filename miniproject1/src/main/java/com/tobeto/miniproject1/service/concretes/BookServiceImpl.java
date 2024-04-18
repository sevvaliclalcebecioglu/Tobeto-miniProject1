package com.tobeto.miniproject1.service.concretes;

import com.tobeto.miniproject1.entities.Book;
import com.tobeto.miniproject1.repositories.BookRepository;
import com.tobeto.miniproject1.service.abstracts.BookService;
import com.tobeto.miniproject1.service.dtos.request.book.CreateBookRequest;
import com.tobeto.miniproject1.service.mappers.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // somut olarak bu classın kullanılmasını belirtirim
public class BookServiceImpl implements BookService
{

    private BookRepository bookRepository;  // bağımlılık tanımladım .

    // dependency injection
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void add(CreateBookRequest createBookRequest) {
        // manuel mapping
        /*Book book = new Book();
        book.setName(createBookRequest.getName());
        book.setPageCount(createBookRequest.getPageCount());
        book.setIsbn(createBookRequest.getIsbn());
        book.setAuthor(createBookRequest.getAuthor()); */
        // mapping , transfer


        Book book1 = BookMapper.INSTANCE.bookFromCreateRequest(createBookRequest);

        bookRepository.save(book1);

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(int id) {
        return null;
    }
}
