package mushi.util;

import mushi.util.internal.Notification;

public class Print {
    public void sentMessage(String msg) {
        Notification notification = new Notification();
        System.out.println(String.format("Printing message: %s", msg));
        notification.sendNotification(msg);
    }
}