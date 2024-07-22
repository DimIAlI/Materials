package org.example.Structural.Decorator;

public class DecoratorCoffee extends Coffee {

    Coffee coffee;

    public DecoratorCoffee(Coffee coffee) {
        super(coffee.cost);
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {

        return coffee.getDescription()
                + " and it cost %d euro.".formatted(coffee.cost);
    }
}
