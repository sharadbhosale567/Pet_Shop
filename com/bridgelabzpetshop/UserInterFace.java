package com.bridgelabzpetshop;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UserInterFace {
    public void print(Set<Pet> petList){
//        for(int i=0; i< petList.size(); i++) {
//            System.out.println(petList.get(i));
//        }

        for(Object o: petList) {
            System.out.println(o);
        }
    }

    public void printAnimals(Set<Pet> petList) {
        for(Pet o: petList) {
            if( o instanceof Animal) {
                System.out.println(o);
            }
        }
    }

    public void printBirds(Set<Pet> petList) {
        for(Pet o: petList) {
            if( o instanceof Bird) {
                System.out.println(o);
            }
        }
    }

    public void printSwimmables(Set<Pet> petList) {
        for(Pet pet: petList){
            if(pet instanceof Swimmable) {
                Swimmable swimmable = (Swimmable)pet;
                //swimmablePet.swim();
            }
        }
    }
}
