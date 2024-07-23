package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.ReceiverDocument;

public class CloseCommand implements Command{

    ReceiverDocument document;

    public CloseCommand(ReceiverDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.close();
    }
}
