package za.ac.cput.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class SessionTest {

    private Session session;
    private AttendanceRecord record;

    @BeforeEach
    public void setUp() {
        session = new Session("SESS001",
                LocalDate.of(2025, 4, 20),
                LocalTime.of(9, 0),
                LocalTime.of(11, 0),
                "Room A1",
                "Lecture");

        record = new AttendanceRecord("REC001", "Present", LocalDateTime.now(), "QR Code", "On time");
    }

    @Test
    public void testSessionInitialization() {
        assertEquals("SESS001", session.getSessionId());
        assertEquals(LocalDate.of(2025, 4, 20), session.getDate());
        assertEquals(LocalTime.of(9, 0), session.getStartTime());
        assertEquals(LocalTime.of(11, 0), session.getEndTime());
        assertEquals("Room A1", session.getLocation());
        assertEquals("Lecture", session.getSessionType());
    }

    @Test
    public void testMarkAttendance() {
        session.markAttendance(record);

        assertEquals(1, session.getAttendanceRecords().size());
        assertEquals(record, session.getAttendanceRecords().get(0));
    }

    @Test
    public void testReschedule() {
        LocalDate newDate = LocalDate.of(2025, 4, 25);
        LocalTime newStart = LocalTime.of(10, 0);
        LocalTime newEnd = LocalTime.of(12, 0);

        session.reschedule(newDate, newStart, newEnd);

        assertEquals(newDate, session.getDate());
        assertEquals(newStart, session.getStartTime());
        assertEquals(newEnd, session.getEndTime());
    }

    @Test
    public void testCancel() {
        // This method just prints; test that it doesn’t throw any exception
        assertDoesNotThrow(() -> session.cancel());
    }

    @Test
    public void testGenerateSessionReport() {
        session.markAttendance(record);
        session.generateSessionReport(); // Output not asserted, just called
    }
}
