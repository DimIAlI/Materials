package org.example.Structural.Composite;

import org.example.Structural.Composite.Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Shape {

    private final List<Shape> shapes = new ArrayList<>();

    void addShape(Shape shape) {
        shapes.add(shape);
    }

    void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
