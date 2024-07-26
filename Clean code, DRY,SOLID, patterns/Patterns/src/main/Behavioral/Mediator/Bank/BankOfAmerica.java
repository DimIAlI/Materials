package org.example.Behavioral.Mediator.Bank;

public class BankOfAmerica implements Bank {

    @Override
    public void createAccount(String name) {
        System.out.printf("Счет в Bank of America для %s создан.\n", name);
    }

    @Override
    public void applyForLoan(String name) {
        System.out.printf("Займ для %s одобрен в Bank of America.\n", name);
    }
}
