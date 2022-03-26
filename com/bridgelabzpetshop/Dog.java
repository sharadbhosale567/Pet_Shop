package com.bridgelabzpetshop;

public class Dog extends Animal implements Swimmable {

    public Dog( String id) {
        this.id = id;
        name = "Dog";
        colour = Colour.BLACK_WHITE;
    }

    @Override
    public void eats() {
        System.out.println("Rabbit eats chicken");
    }

    public void swim() {
    }
}
