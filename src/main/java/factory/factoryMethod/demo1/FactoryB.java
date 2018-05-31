package main.java.factory.factoryMethod.demo1;

public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
