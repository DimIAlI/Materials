package org.example.Behavioral.Observer;

public interface Observer {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();
}
