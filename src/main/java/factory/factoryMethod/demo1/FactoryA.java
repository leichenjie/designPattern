package main.java.factory.factoryMethod.demo1;

public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
