package com.pb.bobro.homework_4;

import java.util.Scanner;

public class CapitalLetter {

    static String add (String stroka1) {

        String s1 = stroka1 ;
        String s2 = "";

        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i++) {
            if (" ".equals(s1.substring(i-1, i)))
                s2 = s2 + s1.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i+1);
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println("введите строку ");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println(add(s1));

    }


    }

