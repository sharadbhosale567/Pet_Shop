package com.bridgelabzpetshop;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PetStorage {

//    private ArrayList<Pet> petList = new ArrayList();

    private Set<Pet> petList = new HashSet();
    public void add(Pet pet) {
        petList.add(pet);
    }

    public Set getPetList() {
        return petList;
    }

    public void remove(Pet pet) {
        petList.remove(pet);
    }
}
