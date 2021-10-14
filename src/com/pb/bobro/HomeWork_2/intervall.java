package com.pb.bobro.HomeWork_2;

import java.util.Scanner;

public class intervall {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x;
            System.out.println("Задайте число");
            int y = scan.nextInt();

            if (y >=0 && y <=14 ) {System.out.println("интервал 1-15");}
            else if ( y >=15 && y <=35){System.out.println("интервал 15-35");}
            else if ( y >=36 && y <=50){ System.out.println("интервал 35-50");}
            else if (y >=51 && y <=100) {System.out.println("интервал 51-100");}
            else System.out.println("интервал не найден (");
        }
    }