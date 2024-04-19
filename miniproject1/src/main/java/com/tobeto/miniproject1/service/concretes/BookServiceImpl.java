package com.tobeto.miniproject1.service.concretes;

import com.tobeto.miniproject1.entities.Book;
import com.tobeto.miniproject1.entities.Category;
import com.tobeto.miniproject1.repositories.BookRepository;
import com.tobeto.miniproject1.repositories.CategoryRepository;
import com.tobeto.miniproject1.service.abstracts.BookService;
import com.tobeto.miniproject1.service.dtos.request.book.CreateBookRequest;
import com.tobeto.miniproject1.service.dtos.responses.book.ListBookResponse;
import com.tobeto.miniproject1.service.mappers.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // somut olarak bu classın kullanılmasını belirtirim
public class BookServiceImpl implements BookService
{

    private BookRepository bookRepository;  // bağımlılık tanımladım .

    private CategoryRepository categoryRepository;


    // dependency injection
    public BookServiceImpl(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
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

        Category category = categoryRepository.findById(createBookRequest.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Böyle bir kategori bilgisi yok."));

        Book book1 = BookMapper.INSTANCE.bookFromCreateRequest(createBookRequest);
        // Compile-Time Error
        // Run-Time Error
        // No Error => Bug


        bookRepository.save(book1);

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<ListBookResponse> getAll() {
        List<Book> books = bookRepository.findAll();
        // Book -> ListBookResponse

        List<ListBookResponse> list = books.stream().map((book)-> BookMapper.INSTANCE.listResponseFromBook(book)).toList();

        return list ;
    }

    @Override
    public Book getById(int id) {
        return null;
    }
}
