package za.ac.cput.Factory;

import za.ac.cput.Domain.Notification;
import za.ac.cput.Util.Helper;

import java.time.LocalDateTime;

public class NotificationFactory {

    public static Notification createNotification(String message, String type) {
        String notificationId = Helper.generateUniqueId();
        LocalDateTime sentTime = Helper.getCurrentDateTime();

        return new Notification(notificationId, message, sentTime, type);
    }
}
