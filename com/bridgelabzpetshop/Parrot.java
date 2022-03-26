package com.bridgelabzpetshop;

public class Parrot extends Bird implements Flyable {

    public Parrot( String id) {
        this.id = id;
        name = "Parrot";
        colour = Colour.GREEN;
    }

    @Override
    public void eats() {
        System.out.println("Parrot eats rice");
    }

    public void fly() {
    }
}
