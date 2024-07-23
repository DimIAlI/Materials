package org.example.Behavioral.Command;

import org.example.Behavioral.Command.Commands.*;

/*
 * Клиент - сущность, которая создает команды
 *
 * Клиент-> инвокер -> команда -> ресивер
 * каждый знает только о своем соседе справа
 * */
public class Main {

    public static void main(String[] args) {
        ReceiverDocument receiverDocument = new ReceiverDocument();

        Command close = new CloseCommand(receiverDocument);
        Command copy = new CopyCommand(receiverDocument);
        Command cut = new CutCommand(receiverDocument);
        Command paste = new PasteCommand(receiverDocument);
        Command open = new OpenCommand(receiverDocument);

        InvokerUser invoker = new InvokerUser(open, close, copy, cut, paste);

        invoker.open();
        invoker.copy();
        invoker.cut();
        invoker.paste();
        invoker.close();
    }
}
