package org.example.human;

public class Roller implements Transport{
    @Override
    public void start() {
        System.out.println("Катаемся на роликах!!!");
    }

    @Override
    public void stop() {
        System.out.println("СТОП! Устал и снимаю ролики!");

    }
}
