package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private final String number;

    public SmsDecorator(Notifier notifier, String number) {
        super(notifier);
        this.number = number;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[SMS -> " + number + "]: " + text);
    }
}
