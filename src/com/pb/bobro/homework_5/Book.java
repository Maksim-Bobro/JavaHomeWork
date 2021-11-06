package com.pb.bobro.homework_5;

public class Book {
 public String namebook;
 public String author;
 public String old;
 public int coll ;



 public Book(String namebook,String author,String old){
  this.namebook = namebook;
  this.author = author;
  this.old = old;
 }
 public String gtBook (String namebook ){
  return namebook;

 }
 String getbook() {
  return " Название книги - " + namebook +" Автор - "+ author +  " Год издания" + old;
 }



 }



