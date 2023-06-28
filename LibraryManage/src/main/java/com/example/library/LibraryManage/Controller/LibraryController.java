package com.example.library.LibraryManage.Controller;

import com.example.library.LibraryManage.Model.Book;
import com.example.library.LibraryManage.service.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class LibraryController {
    @Autowired
    LibraryServiceImpl libraryServiceimpl;
    @PostMapping("/save")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        libraryServiceimpl.addBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
@GetMapping("/title/{title}")
     public ResponseEntity<String> removeBook(@PathVariable String title){
        List<Book> books=libraryServiceimpl.searchBooksByTitle(title);
       if(!books.isEmpty()){
           boolean removed =libraryServiceimpl.removeBook(books.get(0));
           if(removed){
               return new ResponseEntity<>("Book is removed successfully", HttpStatus.OK);
           }
       }
       return new ResponseEntity<>("Book not found" , HttpStatus.NOT_FOUND);
     }
@GetMapping("/author/{author}")
     public ResponseEntity<List<Book>> searchBookByAuthor(@PathVariable String author){
        List<Book> books = libraryServiceimpl.searchBookByAuthor(author);
        if(!books.isEmpty()){
            return new ResponseEntity<>(books, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
@GetMapping("/count")
     public ResponseEntity<Integer> getBookCount(){
        return new ResponseEntity<>(libraryServiceimpl.getBooksCount(), HttpStatus.OK);
     }

}
