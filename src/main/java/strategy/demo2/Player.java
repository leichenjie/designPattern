package main.java.strategy.demo2;

public class Player {
    private Double totalAmount = 0D;
    private Double amount = 0D;
    private CalPrice calPrice = new Orginc();

    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }

    public Double calLastAmount() {
        return calPrice.calPrice(totalAmount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

}
