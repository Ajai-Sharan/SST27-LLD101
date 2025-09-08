package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {

    private final String dept;

    public SlackDecorator(Notifier notifier, String dept) {
        super(notifier);
        this.dept = dept;
    }

    @Override
    public void notify(String text) {
        super.notify(text); 
        System.out.println("[SLACK -> " + dept + "]: " + text);
    }
}
