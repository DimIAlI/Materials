package org.example.Behavioral.Mediator.Client;

import org.example.Behavioral.Mediator.Mediator.BankMediator;

public class Client {

    private final String name;

    private final BankMediator mediator;

    public Client(String name, BankMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void initAccountCreation() {
        mediator.createAccount(this);
    }

    public void initApplyingForLoan() {
        mediator.applyForLoan(this);
    }
}
