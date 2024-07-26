package org.example.Behavioral.Mediator.Mediator;

import org.example.Behavioral.Mediator.Bank.Bank;
import org.example.Behavioral.Mediator.Bank.CityBank;
import org.example.Behavioral.Mediator.Client.Client;

public class CityBankMediator implements BankMediator {

    Bank bank = new CityBank();

    @Override
    public void createAccount(Client client) {
        bank.createAccount(client.getName());
    }

    @Override
    public void applyForLoan(Client client) {
        bank.applyForLoan(client.getName());
    }
}
