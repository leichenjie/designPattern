package main.java.strategy.demo1;

public class BussCar extends Car {

    public BussCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.println(color + " " + name + "在缓慢的行驶...");
    }
}
