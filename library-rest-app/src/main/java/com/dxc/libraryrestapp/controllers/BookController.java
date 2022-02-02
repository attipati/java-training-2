package com.dxc.libraryrestapp.controllers;

import java.time.LocalDate;
import java.util.List;


import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import com.dxc.libraryrestapp.dto.BookDto;
import com.dxc.libraryrestapp.model.Book;
import com.dxc.libraryrestapp.services.BookService;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ModelMapper modelMapper;
    
    @GetMapping("/books") 
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books= bookService.getAllBooks();
        return ResponseEntity.status(HttpStatus.OK).body(books);
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@ Valid @RequestBody BookDto bookReqObj, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        Book book=modelMapper.map(bookReqObj,Book.class);
        book.setPublicationDate(LocalDate.now());
        return ResponseEntity.status(HttpStatus.CREATED).body(book);

    }

    @GetMapping("/bookss/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @PutMapping("bookss/{id}")
    public Book updateBook(@RequestBody Book book , @PathVariable int id){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id){
         bookService.deleteBook(id);
    }
    
}
