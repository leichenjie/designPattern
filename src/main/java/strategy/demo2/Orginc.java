package main.java.strategy.demo2;

@PriceRegion(max = 10000)
public class Orginc implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
