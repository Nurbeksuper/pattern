package com.company.behavioral.chain;

public class SmsNotifier extends Notifier{

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send sms to manager: "+message);
    }
}
