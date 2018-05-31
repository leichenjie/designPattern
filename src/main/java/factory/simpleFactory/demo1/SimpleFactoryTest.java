package main.java.factory.simpleFactory.demo1;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Factory.createProduct("A").show();
        Factory.createProduct("B").show();
        Factory.createProduct("C").show();
        try {
            Factory.createProduct("D").show();
        } catch (NullPointerException e) {
            System.out.println("没有该产品");
        }
    }
}
