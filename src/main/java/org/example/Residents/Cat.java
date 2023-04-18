package org.example.Residents;

public class Cat extends Residents {
    static int catCount;

    public Cat(String type) {
        super(type, 300, 2);
        catCount++;
    }

    public Cat() {

    }
}
