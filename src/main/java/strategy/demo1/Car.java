package main.java.strategy.demo1;

public class Car implements CarFunction {
    protected String name;
    protected String color;
    private CarFunction carFunction;

    public Car(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public void run() {
        System.out.println(color + " " + name + "在行驶...");
    }
}
