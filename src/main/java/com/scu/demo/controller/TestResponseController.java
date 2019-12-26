package com.scu.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestResponseController {
    @RequestMapping("/fn1")
    public String fn1(ModelMap modelMap){
        System.out.println("直接展示视图层");
//        return "forward:ok";'
        modelMap.put("mymy","黄柯翔是一个大傻B,傻人有傻福!!!!!");
        return "ok";
    }
    @RequestMapping("/fn1_1")
    public String fn11(ModelMap modelMap){
        System.out.println("直接展示视图层");
        modelMap.put("mymy","黄柯翔是一个大傻B,傻人有傻福!!!!!");
        return "redirect:/page/ok";
    }

    @RequestMapping("/fn2")
    @ResponseBody
    public Object fn2(){
        //
        String[] str=new String[]{"四川大学","电子科大","西南交大","西南财大","西南石油"};
        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        map.put("code",200);
        map.put("data",str);
        return map;
    }

    //直接通过 response ,可以输出任何内容,包括文件下载
    @RequestMapping("/fn3")
    public void fn3(HttpServletResponse response){
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("我很无聊,但是不敢死");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //文件下载
    public ResponseEntity<byte[]> downLoad(){
        return null;
    }
}
