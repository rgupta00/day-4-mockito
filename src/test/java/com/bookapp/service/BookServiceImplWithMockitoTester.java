package com.bookapp.service;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)//this will integrate junit5 with mockito
public class BookServiceImplWithMockitoTester {

    @InjectMocks
    private BookServiceImpl bookService;

    //Spring DI
    @Mock
    private BookDao bookDao;

    @BeforeEach
    public void before(){
        List<String>books= Arrays.asList("effective java",
                "head first core java","sjcp java","basics python");

//        bookDao=new BookDaoImpl();
//        bookService=new BookServiceImpl(bookDao);
        when(bookDao.getAll()).thenReturn(books);
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
