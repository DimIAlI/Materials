package org.example.Behavioral.Visitor.WithoutVisitor;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }

    @Override
    public void makeAction() {
        System.out.println("Dog makes action");
    }
}
