package za.ac.cput.Domain;

import java.time.LocalDate;

public class Enrollment {
    private LocalDate enrollmentDate;
    private String status; // e.g., "Active", "Inactive"
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = LocalDate.now();
        this.status = "Active";
    }



    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }


    public void activate() {
        this.status = "Active";
        System.out.println("Enrollment activated for student " + student.getStudentId());
    }

    public void deactivate() {
        this.status = "Inactive";
        System.out.println("Enrollment deactivated for student " + student.getStudentId());
    }
}
