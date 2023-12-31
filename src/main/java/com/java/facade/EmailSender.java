package com.java.facade;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    private EmailSettings settings;

    public EmailSender(EmailSettings settings) {
        this.settings = settings;
    }

    public void sendEmail(EmailMessage message) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", settings.getHost());

        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(message.getFrom()));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(message.getTo()));
            mimeMessage.setSubject(message.getSubject());
            mimeMessage.setText(message.getText());

            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
