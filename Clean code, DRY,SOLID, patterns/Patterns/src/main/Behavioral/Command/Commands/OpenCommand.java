package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.ReceiverDocument;

public class OpenCommand implements Command {

    ReceiverDocument document;

    public OpenCommand(ReceiverDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
