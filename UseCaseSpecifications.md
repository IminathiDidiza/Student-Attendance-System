# UseCaseSpecifications.md
## Use Case 1: Record Attendance

Description: Enables pupils to record their attendance for a class period.

Preconditions:

- The student verified
- Active class period
- The student has enrolled in the course.

Postconditions:

established an attendance record and updated the statistics

Fundamental Flow:

- The student chooses the current class.
- finalizes the process of identity verification
- Location is verified by the system.
- Attendance is recorded by the system as "Present"; confirmation is shown.

Other Flows:

Failures in Verification: Error message → Further tries → Outside Boundary: Warning → Flag for review Request for an exception → Verification of the instructor

## Use Case 2: View Attendance History

- Students can examine their attendance history for all of their classes.
- Preconditions: The student verified
- Postconditions: Access logged and history shown

Fundamental Flow:

- Choose the "Attendance History" option.
- See the statistics and percentages
- Use parameters to filter
- If necessary, download the report.

An alternate flow

Absence of Records: Message shown ⇒ Support options offered

## Use Case 3: Request Excused Absence

- Send in the paperwork for the classes you missed.
Preconditions:

- Student-verified absence was noted

Postconditions:

"Pending" request filed; instructor notified

Fundamental Flow:

- Choose absence as an excuse.
- Select the category of reasons.
- Add supporting documentation.
- Send in a request
- Obtain a tracking number.

An alternate flow

Notification of Invalid Documentation ⇒ Format adjustment → Resubmission

## Use Case 4: Take Class Attendance

- The entire class's attendance is recorded by the instructors.
Preconditions:

The instructor verified that the class was in session.

Postconditions:

All student data has been updated, and statistics have been updated.

Fundamental Flow:

Choose a class session.
Note the state of the students.
Make use of quick-selection choices
Send in your attendance.
View the synopsis

Other Flows:

Missing Student: Include the option for students → Confirm your enrollment.
Technical Problem: Recovery of autosave → Resuming recording

## Use Case 5: View Class Attendance Reports

Description: Analytics for course attendance patterns.

Preconditions: Instructor has courses with data

Postconditions: Reports generated and access logged

Basic Flow:

- Select report type
- Set parameters
- View visualizations
- Export if needed

Alternative Flow:

Limited Data: Notification → Parameter adjustment suggestions

## Use Case 6: Approve Excused Absences

Description: Review and process absence requests
.
Preconditions:

Instructor authenticated
Pending requests exist

Postconditions:

Request status updated
Student notified

Basic Flow:

- View pending requests
- Review documentation
- Approve/deny with comments
- Submit decisions

Alternative Flow:

Need More Info: Request additional documentation → Hold pending status

## Use Case 7: Configure System Settings

Description: Customize system behavior.
Preconditions: Administrator authenticated
Postconditions:

Settings updated
Changes logged

Basic Flow:

- Select configuration category
- Modify settings
- Validate changes
- Implement updates

Alternative Flow:

Validation Error: Error messages → Highlight issues → Prevent invalid saves

## Use Case 8: Generate Reports

Description: Create attendance analytics.

Preconditions: User has reporting permissions

Postconditions: Reports created in selected format

Basic Flow:

- Set report parameters
- Choose output format
- Generate report
- Save/share as needed

Alternative Flow:

Complex Report: Processing time estimate → Background processing option

## Use Case 5: View Class Attendance Reports

Description: Analytical data on attendance trends for courses.
Prerequisites: The instructor has data-rich courses.
Postconditions: Access logged and reports generated
Fundamental Flow:

- Choose the type of report.
- Configure the parameters
- See the visualizations
- If necessary, export

An alternate flow

Limited Information: Notification → Suggestions for parameter adjustments

## Use Case 6: Approve Excused Absences

Examine and handle requests for absences.
Preconditions:

The instructor verified
There are pending requests.

Postconditions:

Update the status of your request.
Notification of the student

Fundamental Flow:

- See the pending requests
- Examine the documentation.
- Accept/reject with remarks
- Send in your decisions.

An alternate flow

Need Further Details: Request more documentation and put it on hold.

## Use Case 7: Configure System Settings

Description: Tailor the behavior of the system.

Preconditions: The administrator verified

Postconditions:

Updated settings with logged changes

Fundamental Flow:

- Choose a configuration category.
- Change the settings
- Verify the modifications.
- Put updates into action

An alternate flow

Validation Error: Messages with errors → Issues highlighted → Avoid invalid saves.

## Use Case 8: Generate Reports

Create metrics for attendance.

Prerequisites: The user is authorized to report

Postconditions: Documents produced in a certain format

Fundamental Flow:

- Configure the report's parameters.
- Select the export format.
- Create a report
- As needed, save and share

An alternate flow

Complex Report: Estimated processing time → Option for background processing
