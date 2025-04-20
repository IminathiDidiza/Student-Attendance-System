package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class AbsenceRequestTest {

    private AbsenceRequest absenceRequest;

    @BeforeEach
    void setUp() {
        // Setting up a sample AbsenceRequest instance before each test
        String requestId = "REQ-001";
        String reason = "Sick Leave";
        LocalDateTime submissionDate = LocalDateTime.now();

        absenceRequest = new AbsenceRequest(requestId, reason, submissionDate);
    }

    @Test
    void testConstructor() {
        // Testing if the constructor initializes the object correctly
        assertNotNull(absenceRequest);
        assertEquals("REQ-001", absenceRequest.getRequestId());
        assertEquals("Sick Leave", absenceRequest.getReason());
        assertNotNull(absenceRequest.getSubmissionDate());
        assertEquals("Pending", absenceRequest.getStatus()); // Default status should be "Pending"
        assertTrue(absenceRequest.getSupportingDocuments().isEmpty()); // No documents uploaded yet
    }

    @Test
    void testSubmit() {
        // Testing the submit method
        absenceRequest.submit();
        assertEquals("Pending", absenceRequest.getStatus(), "Status should be 'Pending' after submitting");
    }

    @Test
    void testApprove() {
        // Testing the approve method
        absenceRequest.approve();
        assertEquals("Approved", absenceRequest.getStatus(), "Status should be 'Approved' after approving");
    }

    @Test
    void testReject() {
        // Testing the reject method
        absenceRequest.reject();
        assertEquals("Rejected", absenceRequest.getStatus(), "Status should be 'Rejected' after rejecting");
    }

    @Test
    void testUploadDocument() {
        // Testing the uploadDocument method
        String documentPath = "/documents/medical_cert.pdf";
        absenceRequest.uploadDocument(documentPath);

        // Check if the document is added to the list
        assertFalse(absenceRequest.getSupportingDocuments().isEmpty(), "Document list should not be empty");
        assertTrue(absenceRequest.getSupportingDocuments().contains(documentPath), "Document path should be in the list");
    }

    @Test
    void testMultipleDocumentsUpload() {
        // Testing uploading multiple documents
        String documentPath1 = "/documents/medical_cert.pdf";
        String documentPath2 = "/documents/doctor_note.pdf";

        absenceRequest.uploadDocument(documentPath1);
        absenceRequest.uploadDocument(documentPath2);

        // Ensure both documents are uploaded
        assertTrue(absenceRequest.getSupportingDocuments().contains(documentPath1), "First document should be uploaded");
        assertTrue(absenceRequest.getSupportingDocuments().contains(documentPath2), "Second document should be uploaded");
    }
}
