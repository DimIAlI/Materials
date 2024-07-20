package org.example.Structural.Decorator;

public class SimpleCoffee extends Coffee {

    public SimpleCoffee(int cost) {
        super(cost);
    }

    @Override
    public String getDescription() {
        return "This is a simple coffee";
    }
}
