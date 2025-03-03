```mermaid

C4Context
    title Student Attendance System
    
    Person(student, "Student", "Attends classes")
    Person(teacher, "Teacher", "Records attendance")
    Person(admin, "Admin", "Generates reports")
    
    System(attendanceSystem, "Student Attendance System", "Tracks attendance")
    System_Ext(emailSystem, "Email Service", "Sends notifications")
    
    Rel(student, attendanceSystem, "Views records")
    Rel(teacher, attendanceSystem, "Records attendance")
    Rel(admin, attendanceSystem, "Manages system")
    Rel(attendanceSystem, emailSystem, "Sends alerts")

    title Container Diagram - Student Attendance System
    
    Person(student, "Student", "Attends classes")
    Person(teacher, "Teacher", "Records attendance")
    Person(admin, "Admin", "Generates reports")
    
    System_Boundary(attendanceSystem, "Student Attendance System") {
        Container(webApp, "Web App", "HTML, JS", "User interface")
        Container(apiApp, "API", "Node.js", "Business logic")
        Container(database, "Database", "MongoDB", "Data storage")
    }
    
    System_Ext(emailSystem, "Email Service", "Sends notifications")
    
    Rel(student, webApp, "Uses", "HTTPS")
    Rel(teacher, webApp, "Uses", "HTTPS")
    Rel(admin, webApp, "Uses", "HTTPS")
    
    Rel(webApp, apiApp, "Calls", "JSON/HTTPS")
    Rel(apiApp, database, "Reads/writes", "MongoDB Driver")
    Rel(apiApp, emailSystem, "Sends via", "SMTP")
    title Component Diagram - API Application
    
    Container(webApp, "Web App", "HTML, JS", "User interface")
    
    Container_Boundary(apiApp, "API Application") {
        Component(authComponent, "Auth Component", "Node.js", "Handles user login")
        Component(attendanceComponent, "Attendance Component", "Node.js", "Manages attendance")
        Component(reportComponent, "Report Component", "Node.js", "Creates reports")
        Component(dataAccess, "Data Layer", "Mongoose", "Database access")
    }
    
    Container(database, "Database", "MongoDB", "Data storage")
    System_Ext(emailSystem, "Email Service", "Sends notifications")
    
    Rel(webApp, authComponent, "Calls", "JSON/HTTPS")
    Rel(webApp, attendanceComponent, "Calls", "JSON/HTTPS")
    Rel(webApp, reportComponent, "Calls", "JSON/HTTPS")
    
    Rel(authComponent, dataAccess, "Uses")
    Rel(attendanceComponent, dataAccess, "Uses")
    Rel(reportComponent, dataAccess, "Uses")
    
    Rel(reportComponent, emailSystem, "Sends via", "SMTP")
    Rel(dataAccess, database, "Reads/writes", "MongoDB Driver")
        title Sequence - Recording Attendance {}
