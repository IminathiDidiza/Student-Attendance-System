package za.ac.cput.Domain;

import java.time.LocalDateTime;

public class AttendanceRecord {
    private String recordId;
    private String status;
    private LocalDateTime timestamp;
    private String verificationMethod;
    private String notes;

    public AttendanceRecord(String recordId, String status, LocalDateTime timestamp, String verificationMethod, String notes) {
        this.recordId = recordId;
        this.status = status;
        this.timestamp = timestamp;
        this.verificationMethod = verificationMethod;
        this.notes = notes;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void update(String newStatus, String newNotes) {
        this.status = newStatus;
        this.notes = newNotes;
        this.timestamp = LocalDateTime.now();
    }

    public void markExcused() {
        this.status = "Excused";
    }

    public boolean verifyAttendance() {
        // Verification logic
        return true;
    }
}
