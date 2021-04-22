package com.xsw.dao;

import com.xsw.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

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

    //根据书名查询书
    Books createbookByName(@Param("bookName")String bookName);
}
