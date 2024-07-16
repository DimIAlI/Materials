package org.example.Creational.Builder.FluentBuilder;

import java.util.Arrays;

public class Burger {

    private final Bun bun;
    private final String meat;
    private final String cheese;
    private final String[] vegetables;
    private final String[] sauces;


    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", vegetables=" + Arrays.toString(vegetables) +
                ", sauces=" + Arrays.toString(sauces) +
                '}';
    }

    private Burger(Builder builder) {
        bun = builder.bun;
        meat = builder.meat;
        cheese = builder.cheese;
        vegetables = builder.vegetables;
        sauces = builder.sauces;
    }

    public static class Builder {
        //Обязательный параметр
        private final Bun bun;
        //Дополнительные параметры - опциональны, инициированы по умолчанию
        private String meat = "Без мяса";
        private String cheese = "Без сыра";
        private String[] vegetables = new String[]{"Без овощей"};
        private String[] sauces = new String[]{"Без соуса"};

        public Builder(Bun bun) {
            this.bun = bun;
        }

        Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        Builder vegetables(String... vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        Builder sauces(String... sauces) {
            this.sauces = sauces;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
