package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.ReceiverDocument;

public class CutCommand implements Command {

    ReceiverDocument document;

    public CutCommand(ReceiverDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.cut();
    }
}
