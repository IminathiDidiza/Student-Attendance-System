package za.ac.cput.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student;
    private Course course;
    private AbsenceRequest absenceRequest;

    @BeforeEach
    public void setUp() {
        student = new Student("S101", "John Doe", "john@example.com", "IT", "2025", "0123456789");
        course = new Course("C101", "Software Engineering");
        absenceRequest = new AbsenceRequest("AR101", "Medical reason", LocalDateTime.now());
    }

    @Test
    public void testRegisterCourse() {
        student.registerCourse(course);
        assertEquals(1, course.getEnrollments().size(), "Course should have one enrollment.");
    }

    @Test
    public void testUpdateProfile() {
        student.updateProfile("Jane Doe", "jane@example.com", "0987654321");
        assertEquals("Jane Doe", student.getName());
        assertEquals("jane@example.com", student.getEmail());
        assertEquals("0987654321", student.getPhoneNumber());
    }

    @Test
    public void testRequestExcusedAbsence() {
        student.requestExcusedAbsence(absenceRequest);
        // To test it properly, we’d need to expose the absenceRequests list or track its size
        // You can add a method like getAbsenceRequests() in the Student class for proper testing
        // For now, we just assert no exception was thrown
        assertDoesNotThrow(() -> student.requestExcusedAbsence(absenceRequest));
    }
}
