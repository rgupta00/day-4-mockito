package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao{
    @Override
    public List<String> getAll() {
        return Arrays.asList("effective java",
                "head first core java","sjcp java","basics python");
    }
}
