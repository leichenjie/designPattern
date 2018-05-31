package main.java.strategy.demo1;

public class Person {

    private String name;
    private Integer age;
    private Car car;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void dirve(Car car) {
        System.out.println(name + " " + age + "岁" + "开着");
        car.run();
    }
}
