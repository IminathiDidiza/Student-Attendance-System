package za.ac.cput.Factory;

import za.ac.cput.Domain.Course;

public class CourseFactory {

    public static Course createCourse(String courseId, String courseName) {
        if (courseId == null || courseId.isEmpty())
            throw new IllegalArgumentException("Course ID cannot be null or empty");
        if (courseName == null || courseName.isEmpty())
            throw new IllegalArgumentException("Course name cannot be null or empty");

        return new Course(courseId, courseName);
    }
}



