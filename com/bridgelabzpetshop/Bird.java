package com.bridgelabzpetshop;

public abstract class Bird extends Pet {

    String species;

    @Override
    public String toString() {
        return "Bird{" +
                "Id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ",species='" + species + '\'' +
                '}';
    }
}
