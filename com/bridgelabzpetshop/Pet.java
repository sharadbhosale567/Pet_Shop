package com.bridgelabzpetshop;

import java.util.Objects;

public abstract class Pet {

    enum Colour { BLACK, RED, GREEN, BLUE, BLACK_WHITE, WHITE }

    String id ;
    Colour colour;
    String name;
    int age;
    int price;

    public abstract void eats();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}

