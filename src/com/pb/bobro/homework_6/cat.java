package com.pb.bobro.homework_6;

import java.util.Objects;

public class cat extends Animal {


    public   String cats;
    public cat(String name, String food, String location,String cats) {
            super(name, food, location);
            this.cats =cats;
    }

    @Override
    public String toString() {
        return "cat{" +
                "cats='" + cats + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return cats.equals(cat.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cats);
    }

    @Override
    public void makeNoise (){
        super.makeNoise();
        System.out.println(" Mau mau ");
    }
    @Override
    public  void eat(){
        super.eat();
        System.out.println(getName()+" "+" "+getFood());}
    @Override
    public  void treatAnimal() {
        super.treatAnimal();
        System.out.println(getFood()+"еда "+getLocation()+"локация ");}
}