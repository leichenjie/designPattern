package main.java.factory.factoryMethod.demo1;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createProduct().show();

        FactoryB factoryB = new FactoryB();
        factoryB.createProduct().show();

        FactoryC factoryC = new FactoryC();
        factoryC.createProduct().show();
    }
}
