package org.example.Behavioral.Command;

import org.example.Behavioral.Command.Commands.Command;

public class InvokerUser {

    private Command open;
    private Command close;
    private Command copy;
    private Command cut;
    private Command paste;

    public InvokerUser(Command open, Command close, Command copy, Command cut, Command paste) {
        this.open = open;
        this.close = close;
        this.copy = copy;
        this.cut = cut;
        this.paste = paste;
    }

    public void open() {
        open.execute();
    }

    public void close() {
        close.execute();
    }

    public void copy() {
        copy.execute();
    }

    public void cut() {
        cut.execute();
    }

    public void paste() {
        paste.execute();
    }
}
