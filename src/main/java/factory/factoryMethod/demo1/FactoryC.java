package main.java.factory.factoryMethod.demo1;

public class FactoryC extends Factory {
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
