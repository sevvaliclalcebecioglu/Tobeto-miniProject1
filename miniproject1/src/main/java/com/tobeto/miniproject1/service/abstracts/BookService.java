package com.tobeto.miniproject1.service.abstracts;

import com.tobeto.miniproject1.entities.Book;
import com.tobeto.miniproject1.service.dtos.request.book.CreateBookRequest;

import java.util.List;

public interface BookService {
   void add(CreateBookRequest createBookRequest);
   void update();
   void delete();

   List<Book> getAll();
   Book getById(int id);
}
