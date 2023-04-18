package org.example.Animal;

public class Cat extends Animal {

    static int catCount;

    public Cat(String name, String type) {
        super(name, 200, 30, type);
        catCount++;
    }
}
