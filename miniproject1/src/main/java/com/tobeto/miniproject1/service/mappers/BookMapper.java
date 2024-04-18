package com.tobeto.miniproject1.service.mappers;

import com.tobeto.miniproject1.entities.Book;
import com.tobeto.miniproject1.service.dtos.request.book.CreateBookRequest;
import com.tobeto.miniproject1.service.dtos.responses.book.ListBookResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    // source - target
    // somut alan için ;

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class); // kalıptır


    @Mapping(target = "isbn" , source = "serialNumber")
    Book bookFromCreateRequest(CreateBookRequest createBookRequest);
        // target => book
        // source => CreateBookRequest

    ListBookResponse listResponseFromBook(Book book);

}

