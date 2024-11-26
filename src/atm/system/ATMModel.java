
package atm.system;

import java.util.ArrayList;
import java.util.List;


public class ATMModel implements Observable{
private double balance;
    private final List<Observer> observers;

    public ATMModel() {
        this.observers = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        notifyObservers(); // Notify all observers of the change
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(balance);
        }
    }
}
