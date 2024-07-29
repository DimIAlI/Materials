package org.example.Behavioral.Visitor.WithoutVisitor;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat makes sound");
    }

    @Override
    public void makeAction() {
        System.out.println("Cat makes action");
    }
}
