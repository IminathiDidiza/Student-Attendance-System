package za.ac.cput.Domain;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;

    private List<Enrollment> enrollments = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();


    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters and setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void addSession(Session session) {
        if (session != null) {
            sessions.add(session);
        }
    }

    public List<Session> getSessions() {
        return sessions;
    }

}
