package com.company;
import java.util.HashMap;
import java.util.Map;

public class Animal {
    String name;
    String breed;
    Map<String,String> identifyer = new HashMap<>();

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Map<String,String> addIndentifyer(){
        identifyer.put(name,breed);
        return identifyer;
    }

    public void getType(){
        System.out.println(identifyer.get(name));
    }

    public void adopt(){
        System.out.println(name + " has been adopted!");
        identifyer.remove(name);
    }
}
