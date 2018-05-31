package adapter.demo1;

public class MallardDuck implements Duck {
    @Override
    public void qucak() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
