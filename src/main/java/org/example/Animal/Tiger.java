package org.example.Animal;

public class Tiger extends Cat{
    static int tigerCount;
    public Tiger(String name) {
        super(name, "Тигр");
        tigerCount++;
    }
}
