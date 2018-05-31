package main.java.factory.simpleFactory.demo2;

public class Main {
    public static void main(String[] args) {
        BaseGF baseGF = GFFactory.createGF(GFType.SI_CHUN);
        baseGF.eatFood();
        baseGF.shopping();
    }
}
