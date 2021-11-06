package com.pb.bobro.homework_6;

import java.util.Objects;

public class horse extends Animal{
    public   String hors;
    public horse(String name, String food, String location,String hors) {
        super(name, food, location);
        this.hors =hors;
    }

    @Override
    public String toString() {
        return "horse{" +
                "hors='" + hors + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        horse horse = (horse) o;
        return hors.equals(horse.hors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hors);
    }

    @Override
    public  void treatAnimal() {
        super.treatAnimal();
        System.out.println(getFood()+"еда "+getLocation()+"локация ");}
    @Override
    public void makeNoise (){
        super.makeNoise();
        System.out.println(" Igogo ");
    }
    @Override
    public  void eat(){
        super.eat();
        System.out.println(getName()+" "+" "+getFood());}


}
