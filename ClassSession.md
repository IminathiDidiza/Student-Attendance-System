![Editor | Mermaid Chart-2025-04-07-013954](https://github.com/user-attachments/assets/0b4a7de5-3dde-415f-b819-50aab8dc8a39)
## Key States and Transitions:

Created: Initial state when an instructor creates a class session

Scheduled: Session is set with a specific date, time, and location

Modified: Instructor has made changes to session details

Canceled: Session will not occur

Active: Current time falls within session timeframe

InProgress: Attendance is being recorded for the session

Completed: Session time has concluded

Finalized: All attendance records have been verified

Reported: Session data has been incorporated into reports

## Mapping to Functional Requirements:

The "Created" and "Scheduled" states address FR6: "The system shall let instructors create class sessions"

The "InProgress" state addresses FR7/FR8: "The system shall let instructors mark attendance"/"The system shall let students check in"

The "Reported" state addresses FR10: "The system shall create attendance reports"
