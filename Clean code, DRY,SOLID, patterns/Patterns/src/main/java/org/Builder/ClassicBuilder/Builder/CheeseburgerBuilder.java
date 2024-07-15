package org.example.Builder.ClassicBuilder.Builder;

public class CheeseburgerBuilder extends AbstractBurgerBuilder {
    @Override
    void buildBun() {
        burger.setBun("Bun");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Cheddar");
    }

    @Override
    void buildVegetables() {
        burger.setVegetables(new String[]{"Lettuce", "Onion", "Tomato", "Pickle"});
    }

    @Override
    void buildSauces() {
        burger.setSauces(new String[]{"Ketchup", "Mustard", "Mayonnaise"});
    }
}
