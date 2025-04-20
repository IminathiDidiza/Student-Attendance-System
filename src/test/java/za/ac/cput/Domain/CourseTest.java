package za.ac.cput.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

class CourseTest {

    private Course course;

    @BeforeEach
    void setUp() {
        // Initialize a new Course object before each test
        course = new Course("CS101", "Introduction to Computer Science");
    }

    @Test
    void testAddSession() {
        // Arrange
        LocalDate sessionDate1 = LocalDate.of(2025, 9, 1);
        LocalTime startTime1 = LocalTime.of(10, 0);
        LocalTime endTime1 = LocalTime.of(12, 0);
        Session session1 = new Session("S001", sessionDate1, startTime1, endTime1, "Room 101", "Lecture");

        LocalDate sessionDate2 = LocalDate.of(2025, 9, 3);
        LocalTime startTime2 = LocalTime.of(10, 0);
        LocalTime endTime2 = LocalTime.of(12, 0);
        Session session2 = new Session("S002", sessionDate2, startTime2, endTime2, "Room 102", "Lecture");

        // Act
        course.addSession(session1);
        course.addSession(session2);

        // Assert
        List<Session> sessions = course.getSessions();
        assertEquals(2, sessions.size(), "The course should have 2 sessions.");
        assertTrue(sessions.contains(session1), "Session 1 should be added.");
        assertTrue(sessions.contains(session2), "Session 2 should be added.");
    }

    @Test
    void testAddEnrollment() {
        // Arrange
        Student student1 = new Student("S123", "Alice", "alice@example.com", "Computer Science", "Fall 2025", "123456789");
        Student student2 = new Student("S124", "Bob", "bob@example.com", "Computer Science", "Fall 2025", "987654321");
        Enrollment enrollment1 = new Enrollment(student1, course);
        Enrollment enrollment2 = new Enrollment(student2, course);

        // Act
        course.addEnrollment(enrollment1);
        course.addEnrollment(enrollment2);

        // Assert
        List<Enrollment> enrollments = course.getEnrollments();
        assertEquals(2, enrollments.size(), "The course should have 2 enrollments.");
        assertTrue(enrollments.contains(enrollment1), "Enrollment 1 should be added.");
        assertTrue(enrollments.contains(enrollment2), "Enrollment 2 should be added.");
    }

    @Test
    void testGetCourseId() {
        // Assert
        assertEquals("CS101", course.getCourseId(), "The course ID should be 'CS101'.");
    }

    @Test
    void testGetCourseName() {
        // Assert
        assertEquals("Introduction to Computer Science", course.getCourseName(), "The course name should be 'Introduction to Computer Science'.");
    }
}
