
## 3. Sprint Planning

### Sprint Goal:
"Implement core authentication and attendance recording functionality to enable instructors to create class sessions and students to check in with generated codes."

This sprint goal focuses on delivering the essential MVP features that allow basic attendance tracking to function.

### Sprint Backlog Table:

| Task ID | Task Description | Assigned To | Estimated Hours | Status |
|---------|------------------|-------------|----------------|--------|
| T-001 | Set up user authentication system | Dev Team | 10 | To Do |
| T-002 | Create database schema for users and sessions | Dev Team | 6 | To Do |
| T-003 | Design and implement class session creation UI | UI Team | 8 | To Do |
| T-004 | Develop API for class session management | Dev Team | 12 | To Do |
| T-005 | Build QR/text code generation functionality | Dev Team | 8 | To Do |
| T-006 | Create student check-in interface | UI Team | 6 | To Do |
| T-007 | Implement attendance recording backend | Dev Team | 10 | To Do |
| T-008 | Design basic instructor dashboard | UI Team | 8 | To Do |
| T-009 | Set up action logging and timestamps | Dev Team | 6 | To Do |
| T-010 | Conduct integration testing | QA Team | 10 | To Do |
| T-011 | Create user documentation for core features | Documentation Team | 6 | To Do |

### Selected User Stories for Sprint:

1. **US001**: As a user, I want to securely log into the system so that I can access my attendance features.
2. **US003**: As an instructor, I want to create class sessions so that I can track attendance for each meeting.
3. **US004**: As an instructor, I want to generate a check-in code so that students can mark their attendance.
4. **US005**: As a student, I want to check in with a code so that my attendance is recorded accurately.
5. **US018**: As an administrator, I want the system to log all attendance actions with timestamps so that we maintain an accurate audit trail.

### Sprint Goal Contribution to MVP:
This sprint delivers the minimum functionality needed for an attendance tracking system to work. It establishes the core user authentication, enables instructors to create and manage class sessions, provides the mechanism for generating attendance codes, and allows students to check in. The addition of logging and timestamps ensures data integrity and auditability from the start. These features represent the essential workflow of the attendance tracking system and will provide a solid foundation for future sprints to build upon.

## Reflection
### Challenges in Agile Implementation for the Attendance Tracking System

Translating functional requirements and use cases into well-structured user stories presented several significant challenges during this planning process.

**Prioritization Dilemmas**

The first major challenge was determining the appropriate prioritization for the user stories. As the sole stakeholder in this academic exercise, I found myself wrestling with competing perspectives. On one hand, I was drawn to prioritizing flashy features like location verification (US007) that would demonstrate technical prowess. On the other hand, I knew that core functionality like basic attendance recording needed to come first for the system to have any value.

This internal conflict mirrored real-world stakeholder dynamics where business representatives might push for visible features while technical teams advocate for foundational elements. Ultimately, I had to step back and honestly assess what constituted the minimum viable product, which led to prioritizing authentication, session creation, and basic attendance recording in the first sprint.

**Estimation Uncertainties**

Effort estimation proved particularly challenging without a team to provide diverse perspectives. I found myself alternating between overestimating simple tasks (due to overthinking potential complications) and underestimating complex ones (due to overlooking integration challenges). 

For example, I initially assigned a low effort estimate to the QR code generation feature before realizing it would require integration with the session management system, proper security controls, and expiration handling. This highlighted how estimation in isolation lacks the benefit of collective wisdom and diverse technical perspectives that a team would provide.

**Balancing Technical Debt and Feature Delivery**

Another significant internal struggle centered around whether to include proper logging and timestamps (US018) in the first sprint. Part of me viewed this as "behind the scenes" work that could be deferred to deliver more visible features sooner. However, the more prudent perspective recognized that establishing good data integrity practices from the beginning would prevent costly rework later.

This reflects the classic tension between quick delivery and sustainable development. I ultimately included logging in the first sprint, acknowledging that while it might slow initial delivery, it would provide long-term benefits and prevent accumulating technical debt.

**Scope Management Challenges**

Breaking down user stories into tasks revealed the tendency to expand scope beyond what's necessary for the MVP. For instance, the authentication system could easily balloon to include advanced features like multi-factor authentication or social login integration. I had to constantly remind myself to focus on what's needed for the current sprint rather than building the perfect system immediately.

This struggle mirrors real-world scenarios where scope creep can derail sprint planning if not carefully managed.

**Conclusion**

The process of creating this Agile planning document revealed that even as a single stakeholder, I contained multitudes of perspectives and priorities that needed to be reconciled. This reflection has deepened my appreciation for the value of diverse team input in Agile planning and the importance of staying focused on delivering incremental value through well-defined sprints. The internal resistance I encountered likely mirrors the kinds of tensions that arise between different stakeholders in real-world Agile implementations, making this exercise valuable preparation for managing such dynamics in professional settings.
