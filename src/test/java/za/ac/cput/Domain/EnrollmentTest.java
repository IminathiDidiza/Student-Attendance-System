package za.ac.cput.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentTest {

    private Student student;
    private Course course;
    private Enrollment enrollment;

    @BeforeEach
    public void setUp() {
        // Creating a student instance
        student = new Student("S001", "John Doe", "john.doe@example.com", "Computer Science", "Batch A", "0812345678");

        // Creating a course instance
        course = new Course("C001", "Java Programming");

        // Registering the student for the course
        student.registerCourse(course);  // Assuming the method registers the student to the course

        // Getting the first enrollment of the student
        enrollment = student.getEnrollments().get(0);  // Ensure that there is at least one enrollment
    }

    @Test
    public void testEnrollmentInitialization() {
        // Verifying the student is correctly enrolled
        assertNotNull(enrollment.getEnrollmentDate());
        assertEquals("Active", enrollment.getStatus());
        assertEquals(student, enrollment.getStudent());
        assertEquals(course, enrollment.getCourse());
    }

    @Test
    public void testActivate() {
        // Deactivating and then re-activating the enrollment
        enrollment.deactivate();
        enrollment.activate();
        assertEquals("Active", enrollment.getStatus());
    }

    @Test
    public void testDeactivate() {
        // Deactivating the enrollment and verifying the status change
        enrollment.deactivate();
        assertEquals("Inactive", enrollment.getStatus());
    }

    @Test
    public void testSetEnrollmentDate() {
        // Setting a new enrollment date and verifying it
        enrollment.setEnrollmentDate(LocalDate.of(2023, 5, 15));
        assertEquals(LocalDate.of(2023, 5, 15), enrollment.getEnrollmentDate());
    }

    @Test
    public void testSetStatus() {
        // Setting a new status for the enrollment
        enrollment.setStatus("Inactive");
        assertEquals("Inactive", enrollment.getStatus());
    }

    @Test
    public void testStudentCourseRegistration() {
        // Verifying that the student is enrolled in the course
        assertEquals(1, student.getEnrollments().size()); // Ensure there's one enrollment
        assertEquals(course, student.getEnrollments().get(0).getCourse()); // Ensure it's the correct course
    }

    @Test
    public void testEnrollmentsAddedToCourse() {
        // Verifying that the course has the student enrolled
        assertTrue(course.getEnrollments().contains(enrollment));
    }
}
