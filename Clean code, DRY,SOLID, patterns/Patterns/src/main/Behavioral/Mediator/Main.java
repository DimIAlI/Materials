package org.example.Behavioral.Mediator;

import org.example.Behavioral.Mediator.Bank.CityBank;
import org.example.Behavioral.Mediator.Client.Client;
import org.example.Behavioral.Mediator.Mediator.BankMediator;
import org.example.Behavioral.Mediator.Mediator.BankOfAmericaMediator;

public class Main {

    public static void main(String[] args) {
        BankMediator boaMediator = new BankOfAmericaMediator();
        Client boAClient = new Client("Иван", boaMediator);

        boAClient.initAccountCreation();
        boAClient.initApplyingForLoan();

        BankMediator cityMediator = new BankOfAmericaMediator();
        Client cityClient = new Client("Степан", cityMediator);

        cityClient.initAccountCreation();
        cityClient.initApplyingForLoan();

        CityBank cityBank = new CityBank();
        cityBank.applyForLoan(boAClient.getName());
    }
}
