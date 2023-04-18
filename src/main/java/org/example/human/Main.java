package org.example.human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        Skateboard skateboard = new Skateboard();
        Car car = new Car();
        Roller roller = new Roller();
        human.Stop();
        human.Drive(bicycle);
        human.Stop();
        human.Drive(skateboard);
        human.Stop();
        human.Drive(car);
        human.Stop();
        human.Drive(roller);
        human.Stop();

    }
}
