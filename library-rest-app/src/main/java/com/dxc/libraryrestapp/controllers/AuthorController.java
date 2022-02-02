package com.dxc.libraryrestapp.controllers;

import java.time.LocalDate;
import java.util.List;

import com.dxc.libraryrestapp.model.Author;

import com.dxc.libraryrestapp.services.AuthorService;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {


    

    @Autowired
    private AuthorService authorService;

    @Autowired
    private ModelMapper modelMapper;
    
    @GetMapping("/authors") 
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @PostMapping("/authors")
    public Author createAuthor(@RequestBody Author author){
        author.setCreationDate(LocalDate.now());
        return authorService.createAuthor(author);

    }

    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @PutMapping("authors/{id}")
    public Author updateAuthor(@PathVariable Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/authors/{id}")
    public void deleteAuthor(@PathVariable int id){
         authorService.deleteAuthor(id);
    }

    
}
