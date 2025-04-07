![mermaid-diagram-2025-04-07-024805](https://github.com/user-attachments/assets/826d806b-4bbd-4ad4-8c20-3eb32f7930a3)
 
 ## Key States and Transitions:

Triggered: Alert initiated by attendance falling below threshold

Scheduled: Reminder set for upcoming class

Generated: Notification content created

Queued: Ready to be sent

Sent: Notification has been transmitted

Delivered: Notification has reached the recipient

Read: Recipient has viewed the notification

Acknowledged: Recipient has confirmed receipt

Ignored: Notification was not opened within 7 days

## Mapping to Functional Requirements:


The "Triggered" state addresses FR13: "The system shall send alerts when attendance falls below 75%"

The "Scheduled" state addresses FR14: "The system shall send class reminders to students"

The "Scheduled" to "Generated" transition specifically addresses the FR14 requirement of "Sent 24 hours before class"
