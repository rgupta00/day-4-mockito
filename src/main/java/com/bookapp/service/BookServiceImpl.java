package com.bookapp.service;

import com.bookapp.dao.BookDao;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    public List<String> getAllBySubject(String subject) {
        List<String> books=bookDao.getAll().stream()
                .filter(title->title.contains("java"))
                .toList();

        return books;
    }
}
