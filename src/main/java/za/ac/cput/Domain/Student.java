package za.ac.cput.Domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private String program;
    private String batch;
    private String phoneNumber;

    private List<Enrollment> enrollments = new ArrayList<>();
    private List<AttendanceRecord> attendanceRecords = new ArrayList<>();
    private List<AbsenceRequest> absenceRequests = new ArrayList<>();
    private List<Notification> notifications = new ArrayList<>();

    public Student(String studentId, String name, String email, String program, String batch, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.program = program;
        this.batch = batch;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void registerCourse(Course course) {
        Enrollment enrollment = new Enrollment(this, course);
        enrollments.add(enrollment);
        course.addEnrollment(enrollment);
    }

    public void viewAttendanceReport() {
        // Logic to view attendance report
    }

    public void requestExcusedAbsence(AbsenceRequest request) {
        absenceRequests.add(request);
    }

    public void viewSchedule() {
        // Logic to view schedule
    }

    public void updateProfile(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

}
