package main.java.strategy.demo1;

public class SmallCar extends Car {

    public SmallCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在高速的行驶...");
    }
}
