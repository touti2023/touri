package Day0518.homework08_;

/*
扩展前一个练习的BankAccount类
新类SavingAccount每个月都有利息产生，（earnMonthlyInterest方法被调用。）
并且有每月三次免手续费的存款或取款优惠。
在earnMonthlyInterest 方法中重置交易计数。
 */
public class SavingAccount extends BankAccount{

    //新增属性
    private int count = 3;//接收免费次数
    private double rate = 0.01;//利率 自己设置的

    //统计上个月的利息，同时重置免费次数
    public void earnMonthlyInterest() {
        count = 3;//重置免费使用次数
        super.deposit(getBalance() * rate);
    }

    public SavingAccount(double initialBalance) {//构造器
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    //方法
    public void deposit(double amount) {//存款
        //判断是否还能免手续费
        if(count > 0) {
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);//转入银行1美元
        }
        count--;//减去一次
    }

    //取款
    public void withdraw(double amount) {
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);//存入1美元
        }
        count--;
    }

}
