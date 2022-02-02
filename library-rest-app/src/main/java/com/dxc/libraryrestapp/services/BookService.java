package com.dxc.libraryrestapp.services;

import java.util.List;

import com.dxc.libraryrestapp.model.Book;

public interface BookService {


    public Book getBookById(int id);

    public Book createBook(Book book);

    public Book updateBook(Book book);

    public void deleteBook(int id);

    public List<Book> getAllBooks();
    
    
}
