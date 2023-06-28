package com.example.library.LibraryManage.Repository;

import com.example.library.LibraryManage.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Book,Integer> {
}
