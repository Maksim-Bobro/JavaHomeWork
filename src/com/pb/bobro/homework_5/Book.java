package com.pb.bobro.homework_5;

public class Book {
 String namebook;
 String author;
 String old;
 int coll ;



 public Book(String namebook,String author,String old){
  this.namebook = namebook;
  this.author = author;
  this.old = old;
 }
 String getbook() {
  return " Название книги - " + namebook +" Автор - "+ author +  " Год издания" + old;
 }



 }



