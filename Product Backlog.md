
## Product Backlog

| Story ID | User Story | Priority (MoSCoW) | Effort Estimate | Dependencies |
|----------|------------|-------------------|-----------------|--------------|
| US001 | As a user, I want to securely log into the system so that I can access my attendance features. | Must-have | 3 | None |
| US002 | As an administrator, I want user data to be securely stored so that privacy regulations are met. | Must-have | 4 | None |
| US003 | As an instructor, I want to create class sessions so that I can track attendance for each meeting. | Must-have | 3 | US001 |
| US018 | As an administrator, I want the system to log all attendance actions with timestamps so that we maintain an accurate audit trail. | Must-have | 2 | None |
| US004 | As an instructor, I want to generate a check-in code so that students can mark their attendance. | Must-have | 2 | US003 |
| US005 | As a student, I want to check in with a code so that my attendance is recorded accurately. | Must-have | 3 | US004 |
| US006 | As an instructor, I want to mark attendance for multiple students at once so that I can save time. | Should-have | 3 | US003 |
| US016 | As a user, I want to see a dashboard with relevant attendance statistics so that I can quickly understand my current status. | Should-have | 4 | US005, US006 |
| US008 | As a student, I want to view my attendance history so that I can monitor my participation. | Should-have | 2 | US005 |
| US009 | As an instructor, I want to view class attendance reports so that I can identify attendance patterns. | Should-have | 3 | US006 |
| US010 | As a student, I want to request an excused absence so that my attendance record can be updated appropriately. | Could-have | 3 | US005 |
| US011 | As an instructor, I want to review and approve absence requests so that legitimate absences are properly recorded. | Could-have | 3 | US010 |
| US013 | As a student, I want to receive alerts when my attendance falls below 75% so that I can improve before facing consequences. | Could-have | 2 | US005, US006 |
| US014 | As an instructor, I want to be notified about students with poor attendance so that I can intervene appropriately. | Could-have | 2 | US013 |
| US015 | As an administrator, I want to generate comprehensive attendance reports so that I can provide statistics to stakeholders. | Could-have | 4 | US009 |
| US007 | As a student, I want the system to verify my location so that my attendance is validated. | Won't-have (first release) | 4 | US005 |
| US012 | As a student, I want to receive class reminders so that I don't forget to attend. | Won't-have (first release) | 2 | US003 |
| US017 | As an administrator, I want to configure system settings so that the system meets institutional requirements. | Won't-have (first release) | 3 | None |

### Prioritization Justification:

- **Must-have stories** are core functionality needed for the attendance system to work at a basic level (authentication, session creation, and basic attendance recording).
- **Should-have stories** enhance usability and provide important feedback to users (dashboards, reports, history).
- **Could-have stories** add valuable but non-essential features that enhance the experience (absence management, notifications).
- **Won't-have stories** are features that can be postponed to future releases (location verification, reminders, advanced configuration).

The effort estimates (1-5) reflect complexity and development time, considering both frontend and backend work required.
