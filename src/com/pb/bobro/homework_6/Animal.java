package com.pb.bobro.homework_6;

public class Animal {
    public String name;
    public String food;
    public String location;

    public void setName(String name) {
        this.name = name;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }

    public Animal (String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;}


    public void treatAnimal() {
    }

    public void sleep (){
        System.out.println("Sleep");

    }
    public void makeNoise (){
        System.out.println(" Шуметь ");
    }
    public void eat(){
        System.out.println();
    }







}