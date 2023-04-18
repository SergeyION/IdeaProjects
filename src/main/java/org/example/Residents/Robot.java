package org.example.Residents;

public class Robot extends Residents {
    static int robotCount;

    public Robot(String type) {
        super(type, 100, 1);
        robotCount++;
    }

    public Robot() {

    }
}
