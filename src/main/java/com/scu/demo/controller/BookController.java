package com.scu.demo.controller;

import com.scu.demo.common.domain.Book;
import com.scu.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @RequestMapping("/getbook")
    public  String getBook(ModelMap modelMap,int id){
        Book book = bookService.findBookById(id);
        modelMap.put("book",book);
        return "/views/show-book";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Object test(int id){
        Book book = bookService.findBookById(id);
        return book;
    }

    /**
    演示参数接收
     */

    @RequestMapping("/addbook")
    @ResponseBody
    public String addBook(Book book,String bookname,String content){
        bookService.add(book);

        return "ok";
    }


    //演示日期类型的接收
    @RequestMapping("/addb")
    @ResponseBody
    public String addBook(Book book,Date publishTime){
        bookService.add(book);
        return "ok";
    }


    /**
     * 数组或集合list 作为参数,例如浏览器发送一个参数多个值, 必须@RequestParam
     *
     */

    @RequestMapping("/arrp")
    public String testArrayParam(@RequestParam("id")int[] id){

        return "ok";
    }

    /**
     * 演示以Map 作为参数.当前端参数一个参数,多个值的时候,不好用!!
     * 不是实现同一个参数传多个值，这时需要使用request方法
     * @return
     */
    @RequestMapping("/mapparams")
    public String testMapParam(@RequestParam Map<String,String> map){
        // Map<String, String[]> parameterMap = request.getParameterMap();
        return "ok";
    }


    /**
     * 同时接收多个Bean
     * @return
     */
    @RequestMapping("/addBooks")
    public  String addBooks(BooksBean booksBean){
        return "ok";
    }
    public static class BooksBean{
        private List<Book> books;

        public List<Book> getBooks() {
            return books;
        }

        public BooksBean setBooks(List<Book> books) {
            this.books = books;
            return this;
        }
    }

}
