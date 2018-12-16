package com.agobal.KnyguKeitykla.Entities;


import java.io.Serializable;

public class Books implements Serializable {

    private String BookName;
    private String BookAuthor;
    private String BookImage;



    private String BookTradable;

    public Books(String BookName, String BookAuthor, String BookImage, String BookTradable)
    {
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.BookImage = BookImage;
        this.BookTradable = BookTradable;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public String getBookImage() {
        return BookImage;
    }

    public void setBookImage(String bookImage) {
        BookImage = bookImage;
    }

    public String getBookTradable()
    {
        return BookTradable;
    }

    public void setBookTradable(String bookTradable) {
        BookTradable = bookTradable;
    }

    public String toString(){
        return "name : " + BookName + "\nAge : " + BookAuthor + "\nColor : " + BookImage;
    }


}