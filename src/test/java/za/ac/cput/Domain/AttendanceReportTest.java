package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AttendanceReportTest {

    private AttendanceReport attendanceReport;

    @BeforeEach
    void setUp() {
        // Setup an instance of AttendanceReport before each test
        String reportId = "RPT-001";
        LocalDateTime generatedDate = LocalDateTime.now();
        String reportType = "Monthly Attendance";
        LocalDate periodStart = LocalDate.of(2025, 1, 1);
        LocalDate periodEnd = LocalDate.of(2025, 1, 31);

        attendanceReport = new AttendanceReport(reportId, generatedDate, reportType, periodStart, periodEnd);
    }

    @Test
    void testConstructor() {
        assertNotNull(attendanceReport);
        assertEquals("RPT-001", attendanceReport.getReportId());
        assertNotNull(attendanceReport.getGeneratedDate());
        assertEquals("Monthly Attendance", attendanceReport.getReportType());
        assertEquals(LocalDate.of(2025, 1, 1), attendanceReport.getPeriodStart());
        assertEquals(LocalDate.of(2025, 1, 31), attendanceReport.getPeriodEnd());
    }

    @Test
    void testGeneratePDF() {
        // Testing the generatePDF method
        assertDoesNotThrow(() -> attendanceReport.generatePDF(), "PDF generation should not throw any exceptions.");
    }

    @Test
    void testShareReport() {
        // Testing the shareReport method
        assertDoesNotThrow(() -> attendanceReport.shareReport(), "Report sharing should not throw any exceptions.");
    }

    @Test
    void testAnalyzeAttendanceTrends() {
        // Testing the analyzeAttendanceTrends method
        assertDoesNotThrow(() -> attendanceReport.analyzeAttendanceTrends(), "Analyzing attendance trends should not throw any exceptions.");
    }

    @Test
    void testSetAndGetPeriodDates() {
        // Test if we can set and get the period start and end dates correctly
        LocalDate newStartDate = LocalDate.of(2025, 2, 1);
        LocalDate newEndDate = LocalDate.of(2025, 2, 28);

        attendanceReport.setPeriodStart(newStartDate);
        attendanceReport.setPeriodEnd(newEndDate);

        assertEquals(newStartDate, attendanceReport.getPeriodStart());
        assertEquals(newEndDate, attendanceReport.getPeriodEnd());
    }

    @Test
    void testSetAndGetReportId() {
        // Test if we can set and get the reportId correctly
        attendanceReport.setReportId("RPT-002");
        assertEquals("RPT-002", attendanceReport.getReportId());
    }

    @Test
    void testGeneratedDate() {
        // Verifying that the generatedDate is set correctly and within a reasonable range
        LocalDateTime now = LocalDateTime.now();
        assertTrue(attendanceReport.getGeneratedDate().isBefore(now.plusMinutes(1)) && attendanceReport.getGeneratedDate().isAfter(now.minusMinutes(1)));
    }

    @Test
    void testInvalidDates() {
        // Ensure that invalid date values are handled, such as end date being before start date
        LocalDate invalidEndDate = LocalDate.of(2025, 1, 1);
        attendanceReport.setPeriodEnd(invalidEndDate);

        assertNotEquals(attendanceReport.getPeriodEnd(), attendanceReport.getPeriodStart(), "End date should not be equal to start date.");
    }

    @Test
    void testGeneratedDateNotNull() {
        // Ensure the generated date is not null
        assertNotNull(attendanceReport.getGeneratedDate(), "Generated date should not be null.");
    }
}
