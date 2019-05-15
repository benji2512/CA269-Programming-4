public class BankAccount{
    double balance = 0;

    public BankAccount(){
        balance = 100;
    }

    public BankAccount(double bal){
        balance = bal;
    }

    public void setBalance(double bal){
        balance = bal;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double money){
        balance = balance - money;
    }

    public void deposit(double money){
        balance = balance + money;
    }

    public String toString(){
        return "The balance is " + balance;
    }
}
