package com.pb.bobro.homework_6;

import java.util.Objects;

 class dog extends Animal{
   public   String dogs;

     @Override
     public String toString() {
         return "dog{" +
                 "dogs='" + dogs + '\'' +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         dog dog = (dog) o;
         return dogs.equals(dog.dogs);
     }

     @Override
     public int hashCode() {
         return Objects.hash(dogs);
     }

     public dog(String name, String food, String location, String dogs) {
        super(name, food, location);
        this.dogs =dogs;



    }
    @Override
     public  void treatAnimal() {
        super.treatAnimal();
        System.out.println(getFood()+"еда "+getLocation()+"локация ");

     }

    @Override
    public void makeNoise (){
        super.makeNoise();
        System.out.println(" GAF GAF ");
    }
    @Override
    public  void eat(){
        super.eat();
        System.out.println(getName()+" "+" "+getFood());
    }
}






