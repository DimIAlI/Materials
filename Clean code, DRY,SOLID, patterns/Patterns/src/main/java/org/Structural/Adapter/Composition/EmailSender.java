package org.example.Structural.Adapter.Composition;
/*
 * Класс, с уже реализованным функционалом, который будем переиспользовать
 */

class EmailSender{

    public void sendEmail(String to, String from, String body) {
        System.out.printf("Sending email to %s " +
                "from %s " +
                "and body %s \n", to, from, body);
    }
}