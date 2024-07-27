package org.example.Behavioral.Observer;

public class ConcreteSubscriber implements Subscriber {

    private String name;
    private String text;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String text) {
        doRepost(text);
    }

    void doRepost(String text) {
        this.text = text;
        System.out.printf("Репост сообщения: \"%s\" подписчиком %s\n", text, name);
    }
}
