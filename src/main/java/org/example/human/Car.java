package org.example.human;

public class Car implements Transport {
    @Override
    public void start() {
        System.out.println("Едем на машине!");
    }

    @Override
    public void stop() {
        System.out.println("СТОП МАШИНА!");
    }
}
