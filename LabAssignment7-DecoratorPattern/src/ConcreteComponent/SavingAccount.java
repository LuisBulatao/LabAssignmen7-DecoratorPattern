package ConcreteComponent;

import Component.BankAccount;

public class SavingAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName (String accountName) {
        this.accountName = accountName;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }


    @Override
    public String showAccountType() {
        return "Saving Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Saving Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber +
                "\nAccount name: " + accountName +
                "\nBalance: " + balance;
    }
}
