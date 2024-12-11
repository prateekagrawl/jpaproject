package com.example.jpaproject;

import com.example.jpaproject.domain.Book;
import com.example.jpaproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooksByTitle(String title){
        return bookRepository.findBookByTitle(title);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
