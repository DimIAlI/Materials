package org.example.Structural.Flyweight;

enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    YELLOW("Желтый"),
    ORANGE("Оранжевый");

    final String color;

    Color(String color) {
        this.color = color;
    }

    String getName() {
        return color;
    }
}
