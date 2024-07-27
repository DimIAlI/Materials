package org.example.Behavioral.Observer;

public class Main {

    public static void main(String[] args) {
        PageOwner owner = new PageOwner();
        ConcreteSubscriber firstSub = new ConcreteSubscriber("Mike");
        ConcreteSubscriber secondSub = new ConcreteSubscriber("Nik");

        owner.addSubscriber(firstSub);
        owner.addSubscriber(secondSub);

        owner.setContext(1, "Проверка работы репостов");
    }
}
