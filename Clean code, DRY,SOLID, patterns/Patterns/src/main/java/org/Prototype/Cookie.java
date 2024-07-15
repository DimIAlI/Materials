package org.example.Prototype;

public class Cookie implements Cloneable {

    int a = 1;
    A obj = new A();
    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        return (Cookie) super.clone();

    }

    @Override
    public String toString() {
        return "Cookie{" +
                "a=" + a +
                ", obj=" + obj.i +
                '}';
    }
}
