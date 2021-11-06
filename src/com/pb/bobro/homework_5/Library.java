package com.pb.bobro.homework_5;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book(" Приключения"," Попов Ю.А"," 1999") ;
        Book book2 = new Book(" Фантастика"," Иванов П.В."," 1991") ;
        Book book3 = new Book(" Истрия"," Сидаров У.В."," 2014") ;

        Reader reader1 = new Reader(" Антонович А.Ю."," 1"," FIZ"," 3211123"," 1991");
        Reader reader2= new Reader(" Букашкин Г.Н."," 1"," FIT"," 3232312"," 1994");
        Reader reader3 = new Reader(" Зайкин А.К"," 1"," MAT","325432423"," 1997");

        System.out.println(book1.getbook());
        System.out.println(book2.getbook());
        System.out.println(book3.getbook());

        System.out.println(reader1.getreader());
        System.out.println(reader2.getreader());
        System.out.println(reader3.getreader());
        


}



}
