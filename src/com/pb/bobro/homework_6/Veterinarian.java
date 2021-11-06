package com.pb.bobro.homework_6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractList;
import java.util.Arrays;

public class Veterinarian {
    public static void main(String[] args) throws Exception {


        dog dog1 = new dog(" gaf1 "," meet "," location1 "," Большые зубы ");
        cat cat1 = new cat(" cat1 "," Milk "," Location2 "," Большие усы ");
        horse horse1 = new horse(" horse1 "," Sugar "," Location3 "," Копыта ");
        Animal[] anima = new Animal[] {dog1,cat1,horse1};
        Class claz1 = cat1.getClass();
        Class claz2 = dog1.getClass();
        Class claz3 = horse1.getClass();

        System.out.println(claz1.getName());
        System.out.println(Arrays.toString(claz3.getMethods()));
         for (Animal c: anima){ c.treatAnimal();}

            }


}
