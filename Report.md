![Editor | Mermaid Chart-2025-04-07-014210](https://github.com/user-attachments/assets/d115a53f-79e9-4c16-9921-8eeb41e5c8ea)


## Key States and Transitions:

Requested: Initial state when a user requests a report

Generating: System is compiling and processing data

Generated: Report has been created and is available

Viewed: User is actively looking at the report

Filtered: User has applied filters to customize the report view

Exported: Report has been converted to PDF or CSV

Saved: User has saved the exported report

Dashboard: Report is displayed on user's dashboard

## Mapping to Functional Requirements:

The "Requested" to "Generated" transitions address FR10: "The system shall create attendance reports by class, student, or date"

The "Viewed" to "Filtered" transition addresses FR10: "Can filter and sort results"

The "Viewed" to "Exported" transition addresses FR11: "The system shall allow reports to be exported as PDF and CSV"

The "Dashboard" state addresses FR12: "The system shall show attendance stats on dashboards for each user type"
