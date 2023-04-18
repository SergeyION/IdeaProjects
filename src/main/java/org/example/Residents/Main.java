package org.example.Residents;

public class Main {
    public static void main(String[] args) {
        Residents residents = new Residents("Человек", 400, 2);
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        human.Run(300);
        human.Jump(2);
    }
}
