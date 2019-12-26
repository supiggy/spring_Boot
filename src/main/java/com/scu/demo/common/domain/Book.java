package com.scu.demo.common.domain;

import java.util.Date;

public class Book {
    private Integer id;

    private String bookname;

    private String content;

    private Integer stuId;

    private Date publishTime;

    public Date getPublishTime() {
        return publishTime;
    }

    public Book setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
}