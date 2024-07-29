package org.example.Behavioral.Visitor.Visitor.Visitors;


import org.example.Behavioral.Visitor.Visitor.Elements.Cat;
import org.example.Behavioral.Visitor.Visitor.Elements.Dog;

public class ActionVisitor implements Visitor{

    @Override
    public void visitCat(Cat animal) {
        System.out.println("Cat makes action");
    }

    @Override
    public void visitDog(Dog animal) {
        System.out.println("Dog makes action");
    }
}
