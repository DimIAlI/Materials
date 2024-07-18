package org.example.Structural.Adapter.Inheritance;

public class NotificationFromEmailAdapter extends EmailSender
        implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        sendEmail("?", message, "?");
    }
}
