package za.ac.cput.Domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AbsenceRequest {
    private String requestId;
    private String reason;
    private LocalDateTime submissionDate;
    private String status; // e.g., "Pending", "Approved", "Rejected"
    private List<String> supportingDocuments;

    public AbsenceRequest(String requestId, String reason, LocalDateTime submissionDate) {
        this.requestId = requestId;
        this.reason = reason;
        this.submissionDate = submissionDate;
        this.status = "Pending";
        this.supportingDocuments = new ArrayList<>();
    }

    // Getters and setters
    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(LocalDateTime submissionDate) { this.submissionDate = submissionDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<String> getSupportingDocuments() { return supportingDocuments; }

    // Core methods
    public void submit() {
        this.status = "Pending";
        System.out.println("Absence request " + requestId + " submitted.");
    }

    public void approve() {
        this.status = "Approved";
        System.out.println("Absence request " + requestId + " approved.");
    }

    public void reject() {
        this.status = "Rejected";
        System.out.println("Absence request " + requestId + " rejected.");
    }

    public void uploadDocument(String documentPath) {
        supportingDocuments.add(documentPath);
        System.out.println("Document uploaded: " + documentPath);
    }
}
