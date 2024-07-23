package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.ReceiverDocument;

public class PasteCommand implements Command {

    ReceiverDocument document;

    public PasteCommand(ReceiverDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }
}
