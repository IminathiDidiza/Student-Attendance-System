package za.ac.cput.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.List;

    public class Helper {

        private static final DateTimeFormatter DATE_TIME_FORMATTER =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        /**
         * Generates a unique UUID string.
         */
        public static String generateUniqueId() {
            return UUID.randomUUID().toString();
        }

        /**
         * Returns the current timestamp formatted as yyyy-MM-dd HH:mm:ss.
         */
        public static String getCurrentTimestamp() {
            return LocalDateTime.now().format(DATE_TIME_FORMATTER);
        }

        /**
         * Returns the current LocalDateTime.
         */
        public static LocalDateTime getCurrentDateTime() {
            return LocalDateTime.now();
        }

        /**
         * Validates if a string is neither null nor empty.
         */
        public static boolean isNonEmptyString(String value) {
            return value != null && !value.trim().isEmpty();
        }

        /**
         * Validates email format (simple regex).
         */
        public static boolean isValidEmail(String email) {
            if (email == null) return false;
            return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        }

        /**
         * Validates phone number (digits only, length 7-15).
         */
        public static boolean isValidPhoneNumber(String phone) {
            if (phone == null) return false;
            return phone.matches("\\d{7,15}");
        }

        /**
         * Validates status strings for AttendanceRecord or Enrollment.
         * Example statuses: "Present", "Absent", "Excused", "Active", "Inactive"
         */
        public static boolean isValidStatus(String status) {
            if (status == null) return false;
            return status.matches("(?i)present|absent|excused|active|inactive|pending|approved|rejected");
        }

        /**
         * Validates absence request status.
         */
        public static boolean isValidAbsenceRequestStatus(String status) {
            if (status == null) return false;
            return status.matches("(?i)pending|approved|rejected");
        }

        /**
         * Validates notification type.
         * Example types: "Email", "SMS", "Push"
         */
        public static boolean isValidNotificationType(String type) {
            if (type == null) return false;
            return type.matches("(?i)email|sms|push");
        }

        /**
         * Validates that supporting documents list is not null and contains valid file names.
         */
        public static boolean areValidSupportingDocuments(List<String> documents) {
            if (documents == null) return false;
            for (String doc : documents) {
                if (doc == null || doc.trim().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Validates that credits value is positive.
         */
        public static boolean isValidCredits(int credits) {
            return credits > 0;
        }

        /**
         * Validates attendance threshold (0.0 to 100.0).
         */
        public static boolean isValidAttendanceThreshold(float threshold) {
            return threshold >= 0.0f && threshold <= 100.0f;
        }

        /**
         * Example helper to format period for AttendanceReport.
         */
        public static String formatPeriod(LocalDateTime start, LocalDateTime end) {
            if (start == null || end == null) return "Invalid period";
            return start.format(DATE_TIME_FORMATTER) + " to " + end.format(DATE_TIME_FORMATTER);
        }
    }


