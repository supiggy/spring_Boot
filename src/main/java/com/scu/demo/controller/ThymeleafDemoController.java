package com.scu.demo.controller;


import com.scu.demo.common.domain.Book;
import com.scu.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ThymeleafDemoController {

    //注入dao层
    @Autowired
    private BookMapper bookMapper;
    @RequestMapping("/show")
    public String showDemo(ModelMap modelMap){
        List<Book> books = bookMapper.selectByExample(null);
        Book book = books.get(2);

        String msg = "这是展示的提示信息";
        modelMap.put("books",books);
        modelMap.put("book",book);
        modelMap.put("msg",msg);

        return "thdemo";
    }
}
