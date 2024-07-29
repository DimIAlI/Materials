package org.example.Behavioral.Visitor.Visitor;

import org.example.Behavioral.Visitor.Visitor.Elements.Animal;
import org.example.Behavioral.Visitor.Visitor.Elements.Cat;
import org.example.Behavioral.Visitor.Visitor.Elements.Dog;
import org.example.Behavioral.Visitor.Visitor.Visitors.ActionVisitor;
import org.example.Behavioral.Visitor.Visitor.Visitors.SoundVisitor;
import org.example.Behavioral.Visitor.Visitor.Visitors.Visitor;
/*
* При необходимости добавления нового функционала
* нужно будет создать новую реализацию Visitor,
* а не модифицировать классы иерархии Animal
*/
public class Main {
    public static void main(String[] args) {
        Visitor action = new ActionVisitor();
        Visitor sound = new SoundVisitor();

        Animal cat = new Cat();
        Animal dog = new Dog();


        cat.acceptVisitor(action);
        cat.acceptVisitor(sound);
        System.out.println("\n");
        dog.acceptVisitor(action);
        dog.acceptVisitor(sound);
    }
}
