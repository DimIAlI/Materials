package org.example.Behavioral.ChainOfResponsibility.Trimmers;

public abstract class StringFilter {

    protected StringFilter next;

    public abstract String trim(String str);

    public void setNext(StringFilter next) {
        this.next = next;
    }
}
