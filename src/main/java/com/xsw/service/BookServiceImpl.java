package com.xsw.service;

import com.xsw.dao.BookMapper;
import com.xsw.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {


    //service  调用 dao  层

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addbook(Books books) {
        return bookMapper.addbook(books);
    }

    public int deletebookByID(int id) {
        return bookMapper.deletebookByID(id);
    }

    public int updatabook(Books books) {
        return bookMapper.updatabook(books);
    }

    public Books createbookByID(int id) {
        return bookMapper.createbookByID(id);
    }

    public List<Books> createbooks() {
        return bookMapper.createbooks();
    }

    public Books createbookByName(String bookName) {
        return bookMapper.createbookByName(bookName);
    }
}
