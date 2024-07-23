package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.ReceiverDocument;

public class CopyCommand implements Command {

    ReceiverDocument document;

    public CopyCommand(ReceiverDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.copy();
    }
}
