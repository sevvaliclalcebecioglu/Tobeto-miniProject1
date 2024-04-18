package com.tobeto.miniproject1.repositories;

// Repository => depo - interface

import com.tobeto.miniproject1.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book , Integer>
{

}
