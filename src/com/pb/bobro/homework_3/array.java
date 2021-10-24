package com.pb.bobro.homework_3;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        boolean X = false;
        int Z;
        int sum = 0;
        int summ =0;
        System.out.println("Задай 10 елементов масива :");
        for (int j = 0; j < 10; j++) {
            array[j] = input.nextInt();
        }
        System.out.print ("Елементы масива :");
        for (int j = 0; j < 10; j++) {
        System.out.print (" " + array[j]); }
        System.out.println();
        for (int j = 0; j < 10; j++) if (array[j] > 0){  sum ++; }
        System.out.print ("Количество положительных елементов: " + sum);
        System.out.println();
        for (int j = 0; j < 10; j++) if (array[j] > 0){  summ += array[j]; }
        System.out.print ("Cумма положительных елементов: " + summ);
        while(!X) {
            X = true;
            for (int j = 0; j < array.length-1; j++) {
             if(array[j] > array[j+1]){
                    X = false;
                    Z = array[j];
                    array[j] = array[j+1];
                    array[j+1] = Z;}
           }
        }
        System.out.println();
        System.out.print("Отсортированыый масив : ");
        for (int j = 0; j < 10; j++) { System.out.print (" " + array[j]);}

    }
}
