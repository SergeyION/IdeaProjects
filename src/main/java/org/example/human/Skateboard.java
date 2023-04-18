package org.example.human;

public class Skateboard implements Transport {

    @Override
    public void start() {
        System.out.println("Едем на скейтборде!");
    }

    @Override
    public void stop() {
        System.out.println("СТОП СКЕЙТБОРД!");
    }
}
