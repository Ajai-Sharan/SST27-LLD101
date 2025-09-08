package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {

    private final String user;

    public WhatsAppDecorator(Notifier notifier, String user) {
        super(notifier);
        this.user = user;
    }

    @Override
    public void notify(String text) {
        super.notify(text); 
        System.out.println("[WHATSAPP -> " + user + "]: " + text);
    }
}
