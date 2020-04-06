package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 */
@Service
public class BookService {

    @Autowired
    private BookRepository br;

    public boolean addBook(Book book){
        System.out.println(book);
        if(book.getAuthor() == null) // regra de negocio: caso sem autor - nao adicionar
            return false;
        br.addBook(book);
        return true;
    }
    
    public ArrayList<Book> getBooks(){
        if(br.getBooks().isEmpty())
            return null;
        return br.getBooks();
    }
}