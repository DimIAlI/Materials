package org.example.Behavioral.Visitor.WithoutVisitor;
/*
* Добавление нового функционала в Animal вынуждает изменять все 3 класса
*/
public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        cat.makeAction();
        System.out.println("\n");
        dog.makeSound();
        dog.makeAction();

    }
}
