package com.xsw.service;

import com.xsw.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {


    //增加一本书
    int addbook(Books books);

    //删除一本书
    int deletebookByID(@Param("bookID") int id);

    //修改一本书
    int updatabook(Books books);

    //查询一本书

    Books createbookByID(@Param("bookID")int id);

    //查询全部书

    List<Books> createbooks();

    Books createbookByName(String bookName);
}
