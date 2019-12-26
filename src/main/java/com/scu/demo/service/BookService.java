package com.scu.demo.service;

import com.scu.demo.common.domain.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookService {
    public Book findBookById(int id);

    void add(Book book);
}
