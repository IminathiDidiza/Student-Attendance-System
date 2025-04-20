package za.ac.cput.Factory;

import za.ac.cput.Domain.Instructor;

import java.util.UUID;

public class InstructorFactory {
    public static Instructor createInstructor(String firstName, String lastName, String email, String contactNumber, String department) {
        // Generate a unique ID for the instructor
        String instructorId = UUID.randomUUID().toString();

        return new Instructor(instructorId, firstName, lastName, email, contactNumber, department);
    }
}
