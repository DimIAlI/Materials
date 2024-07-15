package org.example.Builder.ClassicBuilder.Builder;

/*
 * Класс директор. Именно в нем выбирается,
 * какие поля будут участвовать в сборке и устанавливаться дефолтные значения,
 * если они необходимы.
 * Класс является
 */

import org.example.Builder.ClassicBuilder.Burger;

public class Chef {

    private AbstractBurgerBuilder burgerBuilder;

    public void setBurgerBuilder(AbstractBurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger() {
        burgerBuilder.createBurger();

        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildCheese();
        burgerBuilder.buildVegetables();
        burgerBuilder.buildSauces();

        return burgerBuilder.getBurger();
    }
}
