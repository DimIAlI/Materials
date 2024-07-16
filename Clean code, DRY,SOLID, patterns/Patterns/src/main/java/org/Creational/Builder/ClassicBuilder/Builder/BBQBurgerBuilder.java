package org.example.Creational.Builder.ClassicBuilder.Builder;

public class BBQBurgerBuilder extends AbstractBurgerBuilder {

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
        burger.setVegetables(new String[]{"Lettuce", "Onion"});
    }

    @Override
    void buildSauces() {
        burger.setSauces(new String[]{"BBQ"});
    }
}
