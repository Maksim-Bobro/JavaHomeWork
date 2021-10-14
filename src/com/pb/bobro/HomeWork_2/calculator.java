package com.pb.bobro.HomeWork_2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int z;
        String param;

        System.out.println("ВВеди X =");
        x = scan.nextInt();

        System.out.println("Введи Y =");
        y = scan.nextInt();

        System.out.println("Задай знак операции [+ - * /] ");
        param = scan.next();

        char c = param.charAt(0);


        switch (c) {
            case '*' :  z = x * y; System.out.println("Ответ =" + z);
                break;
            case '/' : if ((x & y) == 0)  System.out.println("ноль не вариант было задать при дилении") ;
                else   {z = x / y; System.out.println("Ответ =" + z);}
                break;
            case '+': z = x + y; System.out.println("ответ =" +z);
                break;
            case  '-':  z = x - y; System.out.println("ответ =" +z);
                break;
            default: System.out.println("Вводить только это -->> [+ - / * ]");
        }
    }
}
