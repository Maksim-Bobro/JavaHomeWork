package com.pb.bobro.homework_3;

import java.util.Random;

import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        Random x = new Random();
        int rand = x.nextInt(101);


        System.out.println("Угадайте число.");
        System.out.println("Для выхода из программы введите - exit.");

        int MAX_ATTEMPT = 100;
        int attempt = 0;

        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }
            int t =Integer.parseInt(value);
            if (  t != rand )
                  { if (t > rand) System.out.println("рандомное число меньше" );
                      if (t < rand) System.out.println("рандомное число Больше" );
                continue;
            }

             System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры! рандомное число: " + rand);





    }








    }

