package com.pb.bobro.homework_4;


import java.util.Arrays;
import java.util.Scanner;



public class Anagram {



    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("[^\\p{L}\\p{N}]+", "");
        s2 = s2.replaceAll("[^\\p{L}\\p{N}]+", "");

        return s1.length() == s2.length()
                && checkSum(s1) == checkSum(s2)
                && Arrays.equals(lettersSorted(s1), lettersSorted(s2));
    }
    static long checkSum(String s) {
        long sqrSum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sqrSum += ch + (1L << ch);
        }return sqrSum;
    }
    static char[] lettersSorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return chars;
    }
    public static void main(String[] args) {
        System.out.println("введите строку ");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();

        System.out.println("введите строку анаграмму ");
        Scanner inn = new Scanner(System.in);
        String s2 = inn.nextLine();

         isAnagram(s1,s2);
         System.out.println(isAnagram(s1,s2));



    }
}
