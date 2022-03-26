package com.bridgelabzpetshop;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to pet management system!");

        Animal dog = new Dog("Dog01");
        dog.age = 20;
        dog.price = 3000;
        dog.breed = "xyz";

        Bird duck = new Duck("Duck01");
        duck.age = 20;
        duck.price = 400;
        duck.species = "zxy";

        Animal cat = new Cat("Cat01");
        cat.age = 20;
        cat.price = 400;
        cat.breed = "yuu";

        Animal cat11 = new Cat("Cat011");
        cat.age = 2;
        cat.price = 40;
        cat.breed = "uuu";

        Bird parrot = new Parrot("Parrot01");
        parrot.age = 10;
        parrot.price = 1000;
        parrot.species = "cvv";

        Animal rabbit = new Rabbit("Rabbit01");
        rabbit.age = 20;
        rabbit.price = 100;
        rabbit.breed = "abc";

        PetStorage petStorage = new PetStorage();
        petStorage.add(cat);
        petStorage.add(cat11);
        petStorage.add(dog);
        petStorage.add(rabbit);
        petStorage.add(parrot);
        petStorage.add(duck);

        UserInterFace userInterFace = new UserInterFace();
        Set petList = petStorage.getPetList();
        userInterFace.print(petList);

        petStorage.remove(cat);
        System.out.println("After Removing petList");
        userInterFace.print(petList);

        System.out.println("Print Animals");
        userInterFace.printAnimals(petList);

        System.out.println("Print Birds");
        userInterFace.printBirds(petList);
    }
}
