package encapsulation.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Priyanshu");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
        account.depositMoney(500);
        System.out.println(account.withdrawMoney(50));
    }
}
