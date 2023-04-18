package org.example.Animal;

public class HomeCat extends Cat {

    static int HomeCatCount;
    public HomeCat(String name, int MaxRunDistance) {
        super(name,"Домашний кот");
        HomeCatCount++;
    }
}
