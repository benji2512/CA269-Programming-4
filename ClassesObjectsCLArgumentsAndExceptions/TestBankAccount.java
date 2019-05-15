public class TestBankAccount{
    public static void main(String [] args){
        BankAccount currentAccount1 = new BankAccount(10000.00);
        BankAccount currentAccount2 = new BankAccount();
        currentAccount2.setBalance(200.00);
        System.out.println(currentAccount1);
        System.out.println("The balance for CA2 is " + currentAccount2.balance);
        currentAccount2.withdraw(100.00);
        System.out.println("The balance for CA2 is " + currentAccount2.balance);
        currentAccount1.deposit(300.00);
        System.out.println(currentAccount1.getBalance());
    }
}
