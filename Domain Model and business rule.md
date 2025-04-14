# Entity Relationship Table

| **Entity**         | **Attributes**                                                                                                                                         | **Methods**                                                                                               | **Relationships**                                                                                                                                                      |
|--------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Student**        | - studentId: String  <br> - name: String  <br> - email: String  <br> - program: String  <br> - batch: String  <br> - phoneNumber: String                 | - registerCourse()  <br> - viewAttendanceReport()  <br> - requestExcusedAbsence()  <br> - viewSchedule()  <br> - updateProfile() | - Enrolled in Course (1 Student to 1..* Courses) <br> - Has AttendanceRecord (1 Student to 0..* AttendanceRecords)                                                    |
| **Course**         | - courseId: String  <br> - name: String  <br> - description: String  <br> - credits: Integer  <br> - semester: String  <br> - attendanceThreshold: Float | - addSession()  <br> - generateAttendanceReport()  <br> - setAttendanceThreshold()  <br> - getEnrolledStudents()                  | - Has Sessions (1 Course to 1..* Sessions) <br> - Taught by Instructor (1 Course to 1 Instructor) <br> - Has Students (1 Course to 1..* Students)                      |
| **Session**        | - sessionId: String  <br> - date: Date  <br> - startTime: Time  <br> - endTime: Time  <br> - location: String  <br> - sessionType: String               | - markAttendance()  <br> - generateSessionReport()  <br> - reschedule()  <br> - cancel()                                          | - Belongs to Course (1 Session to 1 Course) <br> - Has AttendanceRecords (1 Session to 0..* AttendanceRecords)                                                         |
| **AttendanceRecord**| - recordId: String  <br> - status: String  <br> - timestamp: DateTime  <br> - verificationMethod: String  <br> - notes: String                         | - update()  <br> - markExcused()  <br> - verifyAttendance()                                                                     | - Belongs to Student (1 AttendanceRecord to 1 Student) <br> - For Session (1 AttendanceRecord to 1 Session)                                                             |
| **Instructor**     | - instructorId: String  <br> - name: String  <br> - email: String  <br> - department: String  <br> - phoneNumber: String                                | - createSession()  <br> - viewCourseAttendance()  <br> - manageExcusedAbsences()  <br> - modifyAttendanceRecord()               | - Teaches Course (1 Instructor to 1..* Courses)                                                                                                                         |
| **AttendanceReport**| - reportId: String  <br> - generatedDate: DateTime  <br> - reportType: String  <br> - periodStart: Date  <br> - periodEnd: Date                        | - generatePDF()  <br> - shareReport()  <br> - analyzeAttendanceTrends()                                                        | - For Course (1 Report to 1 Course) <br> - May Include Student (1 Report to 0..* Students)                                                                              |
| **AbsenceRequest** | - requestId: String  <br> - reason: String  <br> - submissionDate: DateTime  <br> - status: String  <br> - supportingDocuments: List                    | - submit()  <br> - approve()  <br> - reject()  <br> - uploadDocument()                                                          | - Submitted by Student (1 Request to 1 Student) <br> - Reviewed by Instructor (1 Request to 1 Instructor) <br> - For Session (1 Request to 1..* Sessions)              |



# Business Rules

- A Student must be enrolled in at least one Course.
- A Course must have at least one enrolled Student and exactly one assigned Instructor.
- Each Course must have at least one Session scheduled.
- An AttendanceRecord is created for each Student for each Session they are expected to attend.
- Attendance status can be "Present," "Absent," "Late," or "Excused."
- Students must maintain a minimum attendance percentage (typically 75%) to qualify for exams.
- Instructors can modify attendance records within 48 hours of the Session.
- Students can submit AbsenceRequests with supporting documentation for consideration.
- AttendanceReports can be generated for individual Students, specific Courses, or across multiple Courses.
- Verification methods for attendance include "Biometric," "QR Code," "Manual," and "Proxy Detection."
