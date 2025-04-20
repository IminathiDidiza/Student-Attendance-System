package za.ac.cput.Domain;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private String sessionId;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
    private String sessionType;

    // Optional: List of AttendanceRecords for this session
    private List<AttendanceRecord> attendanceRecords;


    public Session(String sessionId, LocalDate date, LocalTime startTime, LocalTime endTime, String location, String sessionType) {
        this.sessionId = sessionId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.sessionType = sessionType;
        this.attendanceRecords = new ArrayList<>();
    }

    // Getters and Setters
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public List<AttendanceRecord> getAttendanceRecords() {
        return attendanceRecords;
    }

    // Behavior Methods
    public void markAttendance(AttendanceRecord record) {
        attendanceRecords.add(record);
        System.out.println("Attendance marked for session " + sessionId);
    }

    public void generateSessionReport() {
        System.out.println("Session Report for: " + sessionId);
        System.out.println("Date: " + date + " | Type: " + sessionType + " | Location: " + location);
        System.out.println("Attendance Records Count: " + attendanceRecords.size());
    }

    public void reschedule(LocalDate newDate, LocalTime newStart, LocalTime newEnd) {
        this.date = newDate;
        this.startTime = newStart;
        this.endTime = newEnd;
        System.out.println("Session " + sessionId + " rescheduled.");
    }

    public void cancel() {
        System.out.println("Session " + sessionId + " has been cancelled.");
        // You can set a cancelled flag or notify students here
    }

}

