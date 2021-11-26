package com.example.pro;

public class Book{

    private String title, author, resume;
    private Integer column;
    private Integer row;
    private Integer publication;

    public Book(String title, String author, String resume, Integer column, Integer row, Integer publication){
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.column = column;
        this.row = row;
        this.publication = publication;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle( String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }


    public void setAuthor( String author){
        this.author = author;
    }

    public String getResume(){
        return this.resume;
    }

    public void setResume( String resume){
        this.resume = resume;
    }

    public Integer getColumn(){
        return this.column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getRow(){
        return this.row;
    }

    public void setRow( Integer row){
        this.row = row;
    }

    public Integer getPublication(){
        return this.publication;
    }

    public void setPublication(Integer publication){
        this.publication = publication;

    }
}