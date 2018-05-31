package main.java.strategy.demo1;

public class Strategy {
    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎","黑色");
        Car bussCar = new BussCar("公交车","白色");
        Person person = new Person("james",20);
        person.dirve(smallCar);
        person.dirve(bussCar);
    }
}
