package test;

import notifier.*;

public class NotificationTest {
    public static void main(String[] args) {
        Notifier notifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                    new EmailNotifier()));
        notifier.send("System Update at 10 PM");
    }
}
