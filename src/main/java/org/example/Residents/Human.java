package org.example.Residents;

public class Human extends Residents {

    static int humanCount;

    public Human(String type) {
        super(type, 100, 3);
        humanCount++;
    }

    public Human() {
    }

    public static int getHumanCount() {
        return humanCount;
    }

    public static void setHumanCount(int humanCount) {
        Human.humanCount = humanCount;
    }
}