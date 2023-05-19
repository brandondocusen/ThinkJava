import java.util.*;

class Account {
    double balance;
    String name;

    public Account(String acname, double bal) {
        name = acname;
        balance = bal;
    }

    public void Withdraw(double bal) {
        balance -= bal;
    }

    public void Deposit(double bal) {
        balance += bal;
    }

    public double Balance() {
        return balance;
    }
}