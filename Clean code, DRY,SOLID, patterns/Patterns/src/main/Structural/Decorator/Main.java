package org.example.Structural.Decorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new DecoratorCoffee(new SimpleCoffee(5));
        System.out.println(coffee.getDescription());
    }
}
