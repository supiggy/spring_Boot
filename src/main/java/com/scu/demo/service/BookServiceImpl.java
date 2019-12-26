package com.scu.demo.service;

import com.scu.demo.common.domain.Book;
import com.scu.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book findBookById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Book book) {
        bookMapper.insert(book);
    }
}
