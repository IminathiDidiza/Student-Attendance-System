![Editor | Mermaid Chart-2025-04-07-013954](https://github.com/user-attachments/assets/477b2751-77e3-4efd-b061-61ed66841cd8)
## Key States and Transitions:

Pending: Initial state for an attendance record before the session

Present: Student has been marked present for the session

Absent: Student was not present for the session

Late: Student arrived after the session started

Modified: Record has been updated with additional information

Reported: Record is included in attendance reports

Exported: Record has been exported to PDF or CSV format

## Mapping to Functional Requirements:

The "Pending" to "Present"/"Late" transitions address FR8: "The system shall let students check in with a code"

The "Pending" to "Present"/"Absent"/"Late" transitions address FR7: "The system shall let instructors mark attendance"

The transition to "Modified" addresses FR9: "The system shall record time stamps for all attendance actions"

The "Reported" state addresses FR10: "The system shall create attendance reports"

The "Exported" state addresses FR11: "The system shall allow reports to be exported as PDF and CSV"
