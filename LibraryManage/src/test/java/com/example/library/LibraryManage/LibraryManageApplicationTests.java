package com.example.library.LibraryManage;

import com.example.library.LibraryManage.Model.Book;
import com.example.library.LibraryManage.service.LibraryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LibraryManageApplicationTests {
	 private LibraryServiceImpl libraryServiceImpl;

@Test
	 public void testAddBook(){
		 Book book = new Book(1,"The catcher in the rye" , "J.D.Salinger");
		 libraryServiceImpl.addBook(book);
		 assertEquals(1, libraryServiceImpl.getBooksCount());

	 }


	@Test
	void contextLoads() {
	}

}
