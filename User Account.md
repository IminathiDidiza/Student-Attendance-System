![Editor | Mermaid Chart-2025-04-07-013729](https://github.com/user-attachments/assets/0bb6d36b-b325-463e-ae89-a567c52a41f1)
## Key States and Transitions:

Created: Initial state when an administrator creates a user account

Active: Normal operational state for users

Locked: Account is temporarily unavailable due to failed login attempts

TimedOut: User session has expired due to inactivity

Inactive: Administrator has disabled the account

RoleChanged: Account is being updated with new permissions

Deleted: Account has been removed from the system

## Mapping to Functional Requirements:

The "Created" state addresses FR1: "Administrators will be able to create and manage user accounts"

The "Active" to "Locked" transition addresses FR4: "Account locks after five unsuccessful attempts"

The "Active" to "TimedOut" transition addresses FR5: "The system will log out inactive users after 30 minutes"

The "RoleChanged" state addresses FR2: "The system has three user roles: student, instructor, and administrator"
