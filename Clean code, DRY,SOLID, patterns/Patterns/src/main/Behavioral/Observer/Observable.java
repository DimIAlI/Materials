package org.example.Behavioral.Observer;

public interface Observable {

    void addSubscriber(Observer subscriber);

    void removeSubscriber(Observer subscriber);

    void notifySubscribers();
}
