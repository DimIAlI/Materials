package org.example.Structural.Flyweight;

/*
 * Содержит частное состояние дерева (контекст)
 */
public class Tree {
    private int coordinateX;
    private int coordinateY;
    public TreeType type;

    public Tree(int x, int y, TreeType type) {
        coordinateX = x;
        coordinateY = y;
        this.type = type;
    }

    public void draw() {
        type.draw();
        System.out.printf(" его координаты %d, %d\n", coordinateX, coordinateY);
    }
}
