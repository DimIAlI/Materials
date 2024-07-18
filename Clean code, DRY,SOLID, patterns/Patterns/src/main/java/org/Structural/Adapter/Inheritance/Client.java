package org.example.Structural.Adapter.Inheritance;

/*
* Клиент, который умеет работать с интерфейсом NotificationSender
*/
public class Client implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        NotificationSender asd = new NotificationFromEmailAdapter();
        asd.sendNotification(message);
    }
}
