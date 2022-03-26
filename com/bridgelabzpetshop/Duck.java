package com.bridgelabzpetshop;

public class Duck extends Bird implements Flyable, Swimmable{

    public Duck( String id) {
        this.id = id;
        name = "Duck";
        colour = Colour.WHITE;
    }

    @Override
    public void eats() {
        System.out.println("Duck eats fish");
    }

    public void fly() {
    }

    public void swim() {
    }
}
