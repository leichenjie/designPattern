package main.java.observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void  rempoveObserver(Observer o);
    public void notifyObservers();
}
