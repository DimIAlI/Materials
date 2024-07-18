package org.example.Structural.Adapter.Composition;

/*
* Реализация с помощью композиции.
* Применяется, если к классу, реализующему функционал, невозможно применить наследование
* либо адаптируемый класс недоступен для расширения (представлен интерфейсом)
*/
public class NotificationFromEmailAdapter implements NotificationSender {

    EmailSender emailSender = new EmailSender();

    @Override
    public void sendNotification(String message) {
        emailSender.sendEmail("?", message, "?");
    }
}
