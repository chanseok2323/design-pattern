package com.java.facade;

public class Client {
    public static void main(String[] args) {
        EmailSettings settings = new EmailSettings();
        settings.setHost("127.0.0.1");

        EmailSender sender = new EmailSender(settings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("chanseok2323@gmail.com");
        emailMessage.setTo("arenal@naver.com");
        emailMessage.setSubject("Hello World");
        emailMessage.setText("Hi Chans");
        sender.sendEmail(emailMessage);
    }
}
