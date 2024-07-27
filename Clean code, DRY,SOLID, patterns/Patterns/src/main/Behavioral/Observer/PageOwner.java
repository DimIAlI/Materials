package org.example.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class PageOwner implements Observable {

    private int postCounter;
    private String textOfPost;

    private final List<Observer> subscribers = new ArrayList<>();

    public void setContext(int postCounter, String textOfPost) {
        this.postCounter = postCounter;
        this.textOfPost = textOfPost;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(text -> text.handleEvent(textOfPost));
    }
}
