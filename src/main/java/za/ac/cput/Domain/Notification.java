package za.ac.cput.Domain;

import java.time.LocalDateTime;

public class Notification {
    private String notificationId;
    private String message;
    private LocalDateTime sentTime;
    private String type; // e.g., "Email", "SMS", "Push"
    private boolean isRead;

    public Notification(String notificationId, String message, LocalDateTime sentTime, String type) {
        this.notificationId = notificationId;
        this.message = message;
        this.sentTime = sentTime;
        this.type = type;
        this.isRead = false;
    }

    // Getters and setters
    public String getNotificationId() { return notificationId; }
    public void setNotificationId(String notificationId) { this.notificationId = notificationId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getSentTime() { return sentTime; }
    public void setSentTime(LocalDateTime sentTime) { this.sentTime = sentTime; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isRead() { return isRead; }
    public void setRead(boolean read) { isRead = read; }

    // Core methods
    public void send() {
        System.out.println("Sending " + type + " notification: " + message);
        this.sentTime = LocalDateTime.now();
    }

    public void markAsRead() {
        this.isRead = true;
        System.out.println("Notification " + notificationId + " marked as read.");
    }
}
