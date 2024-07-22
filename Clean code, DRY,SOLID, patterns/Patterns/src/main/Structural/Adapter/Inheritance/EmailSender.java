package org.example.Structural.Adapter.Inheritance;
/*
* Класс, с уже реализованным функционалом, который будем переиспользовать
*/

public class EmailSender {

    public void sendEmail(String to, String from, String body) {
        System.out.printf("Sending email to %s " +
                            "from %s " +
                            "and body %s \n", to, from, body);
    }
}
