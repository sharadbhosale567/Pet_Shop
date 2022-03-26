package com.bridgelabzpetshop;

public class Cat extends Animal {

    public Cat(String id) {
        this.id = id;
        name = "Cat";
        colour = Colour.BLACK;
    }

    @Override
    public void eats() {
        System.out.println("Cat eats rat ");
    }
}
