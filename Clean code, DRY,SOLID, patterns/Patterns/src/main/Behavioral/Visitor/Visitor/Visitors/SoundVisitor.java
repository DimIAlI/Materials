package org.example.Behavioral.Visitor.Visitor.Visitors;


import org.example.Behavioral.Visitor.Visitor.Elements.Cat;
import org.example.Behavioral.Visitor.Visitor.Elements.Dog;

public class SoundVisitor implements Visitor{
    @Override
    public void visitCat(Cat animal) {
        System.out.println("Cat makes sound");
    }

    @Override
    public void visitDog(Dog animal) {
        System.out.println("Dog makes sound");
    }
}
