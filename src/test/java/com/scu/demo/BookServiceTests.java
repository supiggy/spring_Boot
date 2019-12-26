package com.scu.demo;

import com.scu.demo.common.domain.Book;
import com.scu.demo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTests {
    @Autowired
    private BookService bookService;

    @Test
    public void test1() {
        Book book = bookService.findBookById(2);
        System.out.println(book);
    }

}
