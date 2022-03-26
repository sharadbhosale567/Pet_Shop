package com.bridgelabzpetshop;

public class Rabbit extends Animal {

    public Rabbit(String id) {
        this.id = id;
        name = "Rabbit";
        colour = Colour.WHITE;
    }

    @Override
    public void eats() {
        System.out.println("Rabbit eats grass");
    }
}
