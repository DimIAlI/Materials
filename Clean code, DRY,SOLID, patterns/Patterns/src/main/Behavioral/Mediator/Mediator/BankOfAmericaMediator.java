package org.example.Behavioral.Mediator.Mediator;

import org.example.Behavioral.Mediator.Bank.BankOfAmerica;
import org.example.Behavioral.Mediator.Bank.Bank;
import org.example.Behavioral.Mediator.Client.Client;

public class BankOfAmericaMediator implements BankMediator {

    Bank bankOfAmerica = new BankOfAmerica();


    @Override
    public void createAccount(Client client) {
        bankOfAmerica.createAccount(client.getName());
    }

    @Override
    public void applyForLoan(Client client) {
        bankOfAmerica.applyForLoan(client.getName());
    }
}
