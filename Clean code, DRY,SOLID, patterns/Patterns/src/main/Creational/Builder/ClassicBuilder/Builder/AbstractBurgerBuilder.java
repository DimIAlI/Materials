package org.example.Creational.Builder.ClassicBuilder.Builder;


import org.example.Creational.Builder.ClassicBuilder.Burger;

abstract class AbstractBurgerBuilder {

    Burger burger;

    abstract void buildBun();

    abstract void buildMeat();

    abstract void buildCheese();

    abstract void buildVegetables();

    abstract void buildSauces();

    Burger getBurger() {
        return burger;
    }

    void createBurger() {
        burger = new Burger();
    }
}

