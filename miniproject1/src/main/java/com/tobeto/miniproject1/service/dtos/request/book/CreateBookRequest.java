package com.tobeto.miniproject1.service.dtos.request.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest
{
    // İlişkili tablo için veri istenildiği zaman FK istemek yeterlidir.
    private int categoryId;

    private String name;

    private String author;

    private String serialNumber;

    private int pageCount;
}
