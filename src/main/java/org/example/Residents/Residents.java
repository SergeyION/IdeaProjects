package org.example.Residents;

public class Residents {
    protected String type;
    protected Integer MaxRunDistance;
    protected Integer MaxJumpHeight;
    static int count;

    public Residents(String type, Integer maxRunDistance, Integer maxJumpHeight) {
        this.type = type;
        MaxRunDistance = maxRunDistance;
        MaxJumpHeight = maxJumpHeight;
        count++;
    }

    public Residents() {
    }


    public void Run(int distance) {
        if (distance <= MaxRunDistance) {
            System.out.println(this.type + " - " + "может пробежать " + distance + " метров!!!");
        } else
            System.out.println(this.type + " - " + "не может пробежать " + distance + " метров!");
    }

    public void Jump(int height) {
        if (height <= MaxJumpHeight) {
            System.out.println("Стену высотой " + height + " метров - " + this.type + " может перепрыгнуть!!!");
        } else
            System.out.println("Стену высотой " + height + " метров - " + this.type + " не может перепрыгнуть!");
    }
}



