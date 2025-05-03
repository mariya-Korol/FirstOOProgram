import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Observer> observers;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
        notifyObservers();
    }

    public double getBalance() {
        return balance;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(balance);
        }
    }
}
