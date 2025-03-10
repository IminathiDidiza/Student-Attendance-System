# System Requirements Document

## 1. Introduction
This document outlines the requirements for the Student Attendance Tracking System, which will replace paper-based attendance methods with a digital solution that provides real-time data, automated reports, and better communication.

## 2. Functional Requirements

### User Management
| ID  | Requirement | Acceptance Criteria | Stakeholder |
|-----|------------|---------------------|-------------|
| FR1 | Administrators will be able to create and manage user accounts through the system | Admins can add, modify, and disable accounts; users can be imported from a CSV file; and account creation verifies that the information is correct. | Administrators, IT Staff |
| FR2 | The system has three user roles: student, instructor, and administrator | Each position has particular permissions. The interface changes depending on the role. Position changes are tracked. | All Stakeholders |
| FR3 | The system must allow users to securely reset their passwords. | Reset emails must be received within 30 seconds. Reset links are only valid for 24 hours. New passwords must be secure. | All Stakeholders |

### Authentication
| ID  | Requirement | Acceptance Criteria | Stakeholder |
|-----|------------|---------------------|-------------|
| FR4 | The system will demand a username and password to log in | Account locks after five unsuccessful attempts; passwords are safely saved and login attempts are tracked. | All Stakeholders |
| FR5 | After 30 minutes, the system will log out inactive users | A warning will appear five minutes before logout. Session data will be deleted at logout. Users can prolong their session by logging in again. | All Stakeholders |

### Attendance Recording
| ID  | Requirement | Acceptance Criteria | Stakeholder |
|-----|------------|---------------------|-------------|
| FR6 | The system shall let instructors create class sessions | Instructors will be able to construct class sessions using the system, which will allow them to indicate the day, time, course, and location. Weekly sessions can be produced simultaneously, and they can also be modified or canceled. | Instructors |
| FR7 | The system shall let instructors mark attendance | Options: present, absent, or late. Can mark multiple students at once. Can add notes to attendance records. | Instructors |
| FR8 | The system shall let students check in with a code from the instructor | QR code or text code options. Code only works during class time + 15 min. Optional location verification. | Students, Instructors |
| FR9 | The system shall record time stamps for all attendance actions | Includes when record was created and changed. Keeps history of changes. Handles different time zones correctly. | Administrators, Regulatory Bodies |

### Reporting
| ID  | Requirement | Acceptance Criteria | Stakeholder |
|-----|------------|---------------------|-------------|
| FR10 | The system shall create attendance reports by class, student, or date | Reports show attendance percentages. Includes charts and graphs. Can filter and sort results. | Administrators, Instructors |
| FR11 | The system shall allow reports to be exported as PDF and CSV | Exports include all important data. PDF files look professional. Large exports work smoothly. | Administrators, Instructors |
| FR12 | The system shall show attendance stats on dashboards for each user type | Students see their own attendance. Instructors see class statistics. Admins see school-wide metrics. | All Stakeholders |

### Notifications
| ID  | Requirement | Acceptance Criteria | Stakeholder |
|-----|------------|---------------------|-------------|
| FR13 | The system shall send alerts when attendance falls below 75% | Alerts go to students and relevant staff. Threshold can be changed by course. Keeps record of sent notifications. | Students, Instructors, Parents |
| FR14 | The system shall send class reminders to students | Sent 24 hours before class. Includes class details and check-in info. Students can turn off reminders. | Students |

## 3. Non-Functional Requirements

### Usability
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR1 | The system shall follow WCAG 2.1 AA accessibility guidelines | All Stakeholders |
| NFR2 | The mobile interface shall have touch targets at least 44x44 pixels | Students, Instructors |
| NFR3 | The system shall provide help tooltips for main features | All Stakeholders |

### Deployability
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR4 | The system shall work on AWS, Azure, and Google Cloud | IT Staff, Administrators |
| NFR5 | The system shall use Docker containers for consistent setup | IT Staff |
| NFR6 | The system shall include automatic database update scripts | IT Staff |

### Maintainability
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR7 | The code shall be organized in modules for easier maintenance | System Developers |
| NFR8 | The system shall include complete API documentation | System Developers, IT Staff |
| NFR9 | The system shall record all errors with details for troubleshooting | IT Staff |

### Scalability
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR10 | The system shall handle 100 users at once initially, scalable to 1000+ | Administrators, IT Staff |
| NFR11 | Database shall be optimized for up to 100,000 attendance records | IT Staff |
| NFR12 | The system shall support adding more servers during busy periods | IT Staff |

### Security
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR13 | The system shall encrypt all sensitive data using industry standards | All Stakeholders |
| NFR14 | The system shall restrict access based on user roles | Administrators, Regulatory Bodies |
| NFR15 | The system shall track all changes to attendance records | Administrators, Regulatory Bodies |
| NFR16 | The system shall undergo security testing yearly | IT Staff, Administrators |

### Performance
| ID  | Requirement | Stakeholder |
|-----|------------|-------------|
| NFR17 | The system shall load pages within 3 seconds normally | All Stakeholders |
| NFR18 | Database queries shall complete within 500ms | All Stakeholders |
| NFR19 | Reports shall generate within 10 seconds for up to 10,000 records | Administrators, Instructors |
| NFR20 | The system shall be available 99% of the time during school hours | All Stakeholders |
