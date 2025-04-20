package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class NotificationTest {

    private Notification notification;

    @BeforeEach
    public void setUp() {
        notification = new Notification("NOTIF001", "Your attendance is pending", LocalDateTime.now(), "Email");
    }

    @Test
    public void testNotificationInitialization() {
        assertEquals("NOTIF001", notification.getNotificationId());
        assertEquals("Your attendance is pending", notification.getMessage());
        assertEquals("Email", notification.getType());
        assertFalse(notification.isRead());
    }

    @Test
    public void testSendNotificationUpdatesSentTime() {
        LocalDateTime beforeSend = notification.getSentTime();
        notification.send();
        LocalDateTime afterSend = notification.getSentTime();

        assertNotNull(afterSend);
        assertTrue(afterSend.isAfter(beforeSend) || afterSend.equals(beforeSend));
    }

    @Test
    public void testMarkAsRead() {
        assertFalse(notification.isRead());
        notification.markAsRead();
        assertTrue(notification.isRead());
    }

    @Test
    public void testSetters() {
        notification.setMessage("Session rescheduled");
        notification.setType("SMS");
        notification.setRead(true);

        assertEquals("Session rescheduled", notification.getMessage());
        assertEquals("SMS", notification.getType());
        assertTrue(notification.isRead());
    }
}
