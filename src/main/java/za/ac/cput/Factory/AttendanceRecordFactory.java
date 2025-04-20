package za.ac.cput.Factory;

import za.ac.cput.Domain.AttendanceRecord;
import za.ac.cput.Util.Helper;

import java.time.LocalDateTime;
import java.util.UUID;

public class AttendanceRecordFactory {

    public static AttendanceRecord createAttendanceRecord(String status, String verificationMethod, String notes) {
        String recordId = Helper.generateUniqueId();
        LocalDateTime timestamp = Helper.getCurrentDateTime();
        return new AttendanceRecord(recordId, status, timestamp, verificationMethod, notes);
    }
}
