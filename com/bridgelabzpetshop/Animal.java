package com.bridgelabzpetshop;

public abstract class Animal extends Pet {

    String breed;

    @Override
    public String toString() {
        return "Animal{" +
                "Id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ",breed='" + breed + '\'' +
                '}';
    }
}
