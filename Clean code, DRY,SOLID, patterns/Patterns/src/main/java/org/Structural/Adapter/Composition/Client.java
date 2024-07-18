package org.example.Structural.Adapter.Composition;

/*
 * Клиент, который умеет работать с интерфейсом NotificationSender
 */
public class Client implements NotificationSender {
    @Override
    public void sendNotification(String message) {

        NotificationFromEmailAdapter adapter = new NotificationFromEmailAdapter();
        adapter.sendNotification(message);
    }
}
