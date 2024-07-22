package org.example.Behavioral.ChainOfResponsibility.Trimmers;

public abstract class StringFilter {

    private StringFilter next;

    public abstract String trim(String str);

    public void setNext(StringFilter next) {
        this.next = next;
    }

    String checkNext(String str) {
        if (next != null) {
            str = next.trim(str);
        }
        return str;
    }
}
