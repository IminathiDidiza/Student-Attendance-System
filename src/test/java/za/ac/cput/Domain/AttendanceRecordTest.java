package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class AttendanceRecordTest {

    private AttendanceRecord attendanceRecord;

    @BeforeEach
    void setUp() {
        // Setting up a sample AttendanceRecord instance before each test
        String recordId = "REC-001";
        String status = "Present";
        LocalDateTime timestamp = LocalDateTime.now();
        String verificationMethod = "Manual";
        String notes = "No issues.";

        attendanceRecord = new AttendanceRecord(recordId, status, timestamp, verificationMethod, notes);
    }

    @Test
    void testConstructor() {
        // Testing if the constructor initializes the object correctly
        assertNotNull(attendanceRecord);
        assertEquals("REC-001", attendanceRecord.getRecordId());
        assertEquals("Present", attendanceRecord.getStatus());
        assertNotNull(attendanceRecord.getTimestamp());
        assertEquals("Manual", attendanceRecord.getVerificationMethod());
        assertEquals("No issues.", attendanceRecord.getNotes());
    }

    @Test
    void testUpdateAttendance() {
        // Testing the update method
        String newStatus = "Absent";
        String newNotes = "Sick leave.";
        attendanceRecord.update(newStatus, newNotes);

        assertEquals(newStatus, attendanceRecord.getStatus());
        assertEquals(newNotes, attendanceRecord.getNotes());
        assertNotNull(attendanceRecord.getTimestamp());  // Timestamp should be updated
    }

    @Test
    void testMarkExcused() {
        // Testing the markExcused method
        attendanceRecord.markExcused();
        assertEquals("Excused", attendanceRecord.getStatus());
    }

    @Test
    void testVerifyAttendance() {
        // Testing the verifyAttendance method
        boolean isVerified = attendanceRecord.verifyAttendance();
        assertTrue(isVerified, "Attendance should be verified successfully");
    }

    @Test
    void testInitialStatus() {
        // Ensuring initial status is "Present"
        assertEquals("Present", attendanceRecord.getStatus(), "Status should initially be 'Present'");
    }
}
