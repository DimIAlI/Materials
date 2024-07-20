package org.example.Structural.Composite;

import org.example.Structural.Composite.Shapes.Circle;
import org.example.Structural.Composite.Shapes.Rhombus;
import org.example.Structural.Composite.Shapes.Square;
import org.example.Structural.Composite.Shapes.Triangle;

/*
 *
 */
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();
        Square square = new Square();

        Composite firstComposite = new Composite();
        Composite secondComposite = new Composite();
        Composite thirdComposite = new Composite();

        secondComposite.addShape(circle);
        secondComposite.addShape(triangle);
        secondComposite.addShape(rhombus);
        secondComposite.addShape(square);

        thirdComposite.addShape(circle);
        thirdComposite.addShape(rhombus);
        thirdComposite.addShape(circle);

        firstComposite.addShape(secondComposite);
        firstComposite.addShape(thirdComposite);

        firstComposite.draw();
    }
}
