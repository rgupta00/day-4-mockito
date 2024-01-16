package com.bookapp.service;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceImplTester {

    private BookService bookService;
    private BookDao bookDao;

    @BeforeEach
    public void before(){
        bookDao=new BookDaoImpl();
        bookService=new BookServiceImpl(bookDao);

    }

    @Test
    public void getAllBySubjectTest(){
        assertEquals(3, bookService.getAllBySubject("java").size());
    }


    @AfterEach
    public void after(){
        bookDao=new BookDaoImpl();
        bookService=new BookServiceImpl(bookDao);

    }

}
