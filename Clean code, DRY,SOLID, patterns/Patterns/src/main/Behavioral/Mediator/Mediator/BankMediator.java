package org.example.Behavioral.Mediator.Mediator;

import org.example.Behavioral.Mediator.Client.Client;

public interface BankMediator {

    void createAccount(Client client);

    void applyForLoan(Client client);
}
