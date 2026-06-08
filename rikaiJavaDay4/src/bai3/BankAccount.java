package bai3;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;
    private double interestRate;

    public static final double LOW_BALANCE_PENALTY = 0.01;

    private static int counter = 1;

    public BankAccount(String ownerName, double balance, double interestRate) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
            return;
        }

        balance -= amount;
    }

    public void applyMonthlyInterest() {
        balance += balance * interestRate;
    }

    public void printInfo() {
        System.out.printf("Account: %s | Owner: %s | Balance: %, .0f%n",
                accountNumber, ownerName, balance);
    }

    public static String generateAccountNumber() {
        return String.format("VCB-2024-%03d", counter++);
    }
}