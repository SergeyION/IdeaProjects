package org.example.Animal;

public abstract class Animal {

    protected String name;
    protected Integer MaxRunDistance;
    protected Integer MaxSwimDistance;
    protected String type;
    static int count;

    public Animal(String name, Integer MaxRunDistance, Integer MaxSwimDistance, String type) {

        this.name = name;
        this.MaxRunDistance = MaxRunDistance;
        this.MaxSwimDistance = MaxSwimDistance;
        this.type = type;
        count++;
    }

    public void run(int distance) {
        if (distance <= MaxRunDistance) {
            System.out.println(this.name + " может пробежать " + distance + " метров ");
        } else
            System.out.println(this.name + " не может пробежать " + distance + " метров ");
    }

    public void swim(int distance) {
        if (MaxSwimDistance == 0) {
            System.out.println(this.name + " не умеет плавать!");
            return;
        }
        if (distance <= MaxSwimDistance) {
            System.out.println(this.name + " может проплыть " + distance + " метров ");
        } else
            System.out.println(this.name + " не может проплыть " + distance + " метров ");
    }
}
