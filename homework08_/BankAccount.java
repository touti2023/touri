package Day0518.homework08_;

public class BankAccount {
    private double balance;//余额
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款
    public  void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }
    //set get

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
