package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InstructorTest {

    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor(
                "INS001",
                "John",
                "Doe",
                "john.doe@example.com",
                "0812345678",
                "Computer Science"
        );
    }

    @Test
    public void testInstructorInitialization() {
        assertEquals("INS001", instructor.getInstructorId());
        assertEquals("John", instructor.getFirstName());
        assertEquals("Doe", instructor.getLastName());
        assertEquals("john.doe@example.com", instructor.getEmail());
        assertEquals("0812345678", instructor.getContactNumber());
        assertEquals("Computer Science", instructor.getDepartment());
    }

    @Test
    public void testSetters() {
        instructor.setFirstName("Jane");
        instructor.setLastName("Smith");
        instructor.setEmail("jane.smith@example.com");
        instructor.setContactNumber("0823456789");
        instructor.setDepartment("Information Systems");

        assertEquals("Jane", instructor.getFirstName());
        assertEquals("Smith", instructor.getLastName());
        assertEquals("jane.smith@example.com", instructor.getEmail());
        assertEquals("0823456789", instructor.getContactNumber());
        assertEquals("Information Systems", instructor.getDepartment());
    }

    @Test
    public void testDisplayInfo() {
        // This just checks if the method runs without throwing an exception
        assertDoesNotThrow(() -> instructor.displayInfo());
    }
}
