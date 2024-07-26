package org.example.Behavioral.Mediator.Bank;

public class CityBank implements Bank {

    @Override
    public void createAccount(String name) {
        System.out.printf("Счет в City bank для %s создан.\n", name);
    }

    @Override
    public void applyForLoan(String name) {
        System.out.printf("Займ для %s одобрен в City bank.\n", name);
    }

}
