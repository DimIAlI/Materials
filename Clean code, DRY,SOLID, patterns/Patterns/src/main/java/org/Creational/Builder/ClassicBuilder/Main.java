package org.example.Creational.Builder.ClassicBuilder;


import org.example.Creational.Builder.ClassicBuilder.Builder.BBQBurgerBuilder;
import org.example.Creational.Builder.ClassicBuilder.Builder.CheeseburgerBuilder;
import org.example.Creational.Builder.ClassicBuilder.Builder.Chef;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef();

        chef.setBurgerBuilder(new CheeseburgerBuilder());
        Burger cheeseBurger = chef.buildBurger();
        System.out.println(cheeseBurger);

        chef.setBurgerBuilder(new BBQBurgerBuilder());
        Burger bbqBurger = chef.buildBurger();
        System.out.println(bbqBurger);
    }
}
