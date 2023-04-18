package org.example.human;

public class Human {
    private Transport currentTransport;

    public void Stop() {
        if (currentTransport != null) {
            currentTransport.stop();
            currentTransport = null;
        } else {
            System.out.println("Движение ещё не началось!");
        }
    }

    public void Drive(Transport transport) {
        if (currentTransport == null) {
            transport.start();
            currentTransport = transport;
        } else {
            System.out.println("Уже ЕДЕМ!!");
        }
    }

//    private Car lastCar;
//    private Skateboard lastSkateboard;
//    private Bicycle lastBicycle;
//
//    public void Drive(Car car) {
//        car.run();
//        lastCar = car;
//    }
//
//    public void Drive(Skateboard skateboard) {
//        skateboard.runSkate();
//        lastSkateboard = skateboard;
//    }
//
//    public void Drive(Bicycle bicycle) {
//        bicycle.runBicycle();
//        lastBicycle = bicycle;
//    }
//
//    public void Stop() {
//        if (lastCar != null){
//            lastCar.stop();
//            lastCar=null;
//        }
//    }
}
