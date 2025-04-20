package za.ac.cput.Factory;

import za.ac.cput.Domain.AttendanceReport;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AttendanceReportFactory {

    public static AttendanceReport createAttendanceReport(String reportType,
                                                          LocalDate periodStart,
                                                          LocalDate periodEnd) {
        String reportId = Helper.generateUniqueId();
        LocalDateTime generatedDate = Helper.getCurrentDateTime();

        return new AttendanceReport(reportId, generatedDate, reportType, periodStart, periodEnd);
    }
}

