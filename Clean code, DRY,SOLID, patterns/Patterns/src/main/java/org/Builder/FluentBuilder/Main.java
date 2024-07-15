package org.example.Builder.FluentBuilder;

import static org.example.Builder.FluentBuilder.Bun.*;
import static org.example.Builder.FluentBuilder.Burger.*;

public class Main {

    public static void main(String[] args) {
        Burger defaultBurger = new Builder(CLASSIC_BUN).build();
        System.out.println(defaultBurger);

        Burger customBurger = new Builder(SESAME_BUN)
                .meat("Chicken")
                .cheese("Brie")
                .vegetables("Onion", "Tomato")
                .sauces("Mayo", "Ketchup")
                .build();
        System.out.println(customBurger);
    }
}
