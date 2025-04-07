![Editor | Mermaid Chart-2025-04-07-020150](https://github.com/user-attachments/assets/91b11fd2-3322-4d0b-a79d-f316c55afe13)

## Key States and Transitions:


Created: Initial state when a course is set up in the system

Active: Course is open but no sessions have occurred yet

InProgress: Course sessions are being conducted

AttendanceTracked: System is recording attendance for sessions

AlertsEnabled: System is monitoring attendance and sending alerts if needed

Completed: All course sessions have concluded

Archived: Course data is maintained for historical reporting

## Mapping to Functional Requirements:

The "InProgress" state relates to FR6: "The system shall let instructors create class sessions"

The "AttendanceTracked" state addresses FR7/FR8: Attendance marking and check-ins

The "AlertsEnabled" state addresses FR13: "The system shall send alerts when attendance falls below 75%"
The "Archived" state supports FR10/FR11: Reporting capabilities
