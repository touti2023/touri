package Day0518.homework08_;

/*
在父类的基础上扩展新类 CheckingAccount，对每次存款和取款都收取1美元手续费。
 */
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {//存款
        super.deposit(amount -1);//使用父类已有方法减一即可。
    }

    public void withdraw(double amount) {//存款
        super.withdraw(amount + 1);


    }
}
