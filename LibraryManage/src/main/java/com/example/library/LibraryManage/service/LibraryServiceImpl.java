package com.example.library.LibraryManage.service;

import com.example.library.LibraryManage.Model.Book;
import com.example.library.LibraryManage.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
@Service
public class LibraryServiceImpl implements LibraryService{
    @Autowired
    LibraryRepository libraryRepository;

    private List<Book> books;

    public LibraryServiceImpl(){
        books =new ArrayList<>();
    }
    @Override
    public int getAllBooks() {
     return books.size();
    }

    @Override
    public void addBook(Book book) {
     books.add(book);
    }

    @Override
    public boolean removeBook(Book book) {

        return books.remove(book);
    }

    @Override
    public List<Book> searchBooksByTitle(String title) {
        List<Book> result= new ArrayList<>();
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> searchBookByAuthor(String author) {
        List<Book> result1 = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                result1.add(book);
            }
        }

        return result1;
    }

    @Override
    public int getBooksCount() {

        return books.size();
    }
}
