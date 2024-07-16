package org.example.Creational.Builder.ClassicBuilder;

import java.util.Arrays;

public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String[] vegetables;
    private String[] sauces;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }

    public void setSauces(String[] sauces) {
        this.sauces = sauces;
    }

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
}