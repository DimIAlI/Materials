package org.example.Structural.Flyweight;

import java.util.Objects;

/*
 * Класс приспособленец, содержит общее состояние всех деревьев
 */
class TreeType {
    private final String type;
    private final Color color;

    public TreeType(String type, Color color) {
        this.type = type;
        this.color = color;
    }

    public void draw() {
        System.out.printf("Тип дерева %s, цвет %s", type, color.getName());
    }

}
