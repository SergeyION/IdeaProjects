package org.example.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Бобик"), new Dog("Рекс"), new HomeCat("Марсалес", 50),
                new HomeCat("Ньют", 70), new Tiger("Шерхан")};
        for (Animal item : animals) {
            item.run(150);
            item.swim(10);
            // Бобик может пробежать 150 метров
            // Бобик может проплыть 10 метров
            // Рекс может пробежать 150 метров
            // Рекс может проплыть 10 метров
            // Марсалес может пробежать 150 метров
            // Марсалес не умеет плавать!
            // Ньют может пробежать 150 метров 
            // Ньют не умеет плавать!
            // Шерхан может пробежать 150 метров
            // Шерхан может проплыть 10 метров
        }
//        System.out.println("catCount = " + Cat.catCount); // catCount = 3
//        System.out.println("Total count = " + Animal.count); // Total count = 5
//        System.out.println("count = " + Cat.count); // count = 5
    }
}