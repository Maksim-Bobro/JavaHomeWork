package com.pb.bobro.homework_6;


import java.sql.Array;
import java.util.Arrays;

public class Vetklinik  {
    public static void main(String[] args) {

    Animal[] animalss = new Animal[3];
        {
            animalss[0] = new Animal(" dog1",  " meet ", "location1");
            animalss[1] = new Animal(" cat1 ", " milk ", "location1");
            animalss[2] = new Animal(" horse1 ", " sugar ", "location1");
            }
            for(int i=0; i<3; i++) {
                System.out.println(animalss[i].name+" отправлен к ветеренару");
            }


    }
    }

