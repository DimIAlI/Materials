package org.example.Structural.Decorator;

public abstract class Coffee {

    int cost;

    public Coffee(int cost) {
        this.cost = cost;
    }

    public abstract String getDescription();
}
