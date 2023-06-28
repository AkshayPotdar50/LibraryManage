package com.example.library.LibraryManage.service;

import com.example.library.LibraryManage.Model.Book;

import java.util.List;

public interface LibraryService {

    public int getAllBooks();

    public void addBook(Book book);

    public boolean removeBook(Book book);

    public List<Book> searchBooksByTitle(String title);

    public List<Book> searchBookByAuthor(String author);

    public int getBooksCount();



}
