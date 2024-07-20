package org.example.Structural.Flyweight;

import static org.example.Structural.Flyweight.Color.*;

public class Main {

    public static void main(String[] args) {

        Tree greenOak =
                new Tree(2, 3,
                        TreeFactory.getTreeType("Дуб", YELLOW));
        Tree yellowOak =
                new Tree(2, 5,
                        TreeFactory.getTreeType("Дуб", GREEN));
        Tree greenPalm =
                new Tree(12, 1,
                        TreeFactory.getTreeType("Пальма", GREEN));
        greenOak.draw();
        yellowOak.draw();
        greenPalm.draw();

        boolean equals = greenOak.type.equals(yellowOak.type);
        System.out.println("\n" + equals);

        boolean equals2 = greenOak.type.equals(greenPalm.type);
        System.out.println("\n" + equals2);
    }
}
