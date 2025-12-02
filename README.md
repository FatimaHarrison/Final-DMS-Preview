# DMS-Preview
The Terralina Database Management System (DMS) is a Java-based application designed to streamline restaurant operations through a modular, GUI-driven interface. It integrates an embedded SQLite database (Terralina.db) with multiple role-based dashboards, ensuring secure data handling, audit traceability, and professional maintainability.

This project replaces traditional CLI workflows with interactive GUI panels, providing managers and hosts with intuitive access to reservations, employee records, and audit logs.
_______________________________________________________________________________________
**The main objectives**
-Database Integration: Embeded SQLite (Terralina.db) directly into the project for portability and persistence.

-Role-Based Access: Implement login validation for Manager and Host roles.

-Audit Logging: Track login attempts and CRUD operations for compliance and traceability.

-GUI Usability: Provide clear, user-friendly panels for reservations, employee records, and audit logs.

-Maintainability: Standardize code comments, modularize logic, and align with professional software engineering practices.
_______________________________________________________________________________________
**Main Project structure**
Terralina Database/
│
├── src/
└── docs/                       # Generated Javadoc documentation
├── resources/
│   └── Terralina.db            # Embedded SQLite database
│   ├── DBHelper/               # Core JDBC helper and table-specific classes
│   │   ├── DBHelper.java
│   │   ├── Reservation.java
│   │   ├── employeeRecords.java
│   │   └── auditlog.java
│   │
│   ├── GUI/                    # Role-based GUI panels
│   │   ├── LoginGUI.java
│   │   ├── HostMenuGUI.java
│   │   ├── ManaMenuGUI.java
│   │   ├── EmployeeRecordGUI.java
│   │   └── AuditLogGUI.java
│   │
│   └── DMS.java                # Core controller for login validation and audit insertion
│
│____Textual/
|    └── Data
|    ├── Records
|    ├── Employee Records       # Textaul files for data inserts 
_______________________________________________________________________________________ **Key Features*
Login System: Validates authorized employee 7 digit ID and role against database records. Prompts users via GUI and records attempts in auditlog.

Employee Record Management: Add, delete, and display employee records.
Input validation (ID format, name length, status constraints).

Reservation Management: Query and display reservation data and supports CRUD operations with table refresh.

Audit Log Dashboard:Displays login attempts and system actions for serched start/end dates in the range of 30days previuos from the curreny day.
Ensures compliance and forensic review.

Documentation:Inline comments standardized for clarity. Javadoc-generated docs/ folder for professional review in html link.
_______________________________________________________________________________________
The Terralina DMS represents more than just a technical endeavor; it serves as a strategic platform that integrates the rigor of software engineering with the essential requirements of restaurant management. Through the incorporation of a database, the standardization of documentation, and the implementation of role-based graphical user interfaces, this project provides a solution that is both professional and maintainable, as well as academically sound.
