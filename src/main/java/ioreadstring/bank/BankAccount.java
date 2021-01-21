package ioreadstring.bank;

public class BankAccount {
    private String name;
    private String accountNumber;
    private int balance;

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int add(int amount) {
        return this.getBalance() + amount;
    }

    public int substract(int amount) {
        return this.getBalance() - amount;
    }
}
