package DecoratorInterface;

import Component.BankAccount;

public interface BankAccountDecorator extends BankAccount {
    void setBankAccount(BankAccount accountBank);

}
