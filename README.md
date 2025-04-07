
Built by https://www.blackbox.ai

---

```markdown
# Hospital File Management System

## Project Overview
The Hospital File Management System is a Java-based application that utilizes Remote Method Invocation (RMI) to manage patient files. It allows healthcare professionals to create, view, and download patient files securely over the network. The application provides a user-friendly graphical interface built with Swing, making it easy to use for managing patient records.

## Installation
### Prerequisites
- JDK 11 or later
- Apache Maven (optional for building)

### Steps to Install
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd hospital-file-management-system
   ```

2. **Compile the Java files:**
   Using the command line, navigate to the project directory and compile the Java files:
   ```bash
   javac *.java
   ```

3. **Start the RMI registry:**
   Run the server to start the RMI registry:
   ```bash
   java Server
   ```

4. **Run the client application:**
   Open another terminal and run the client:
   ```bash
   java HospitalSystemTest
   ```

## Usage
### Running the Application
1. After launching the server, open the client GUI by executing `HospitalSystemTest`.
2. Use the buttons in the application to create a new patient file, view existing files, or download selected patient files.

### Creating a Patient File
- Click on the "Create Patient File" button to open a dialog where you can enter patient details.
- Fill in the form and click "Save" to create the file.

### Viewing Patient Files
- Click on "View Patient Files" to see a list of saved patient files.

### Downloading Patient Files
- Select a file from the list and click "Download Selected" to save it to your local system.

## Features
- **Create new patient files:** Enter patient information including name, age, gender, diagnosis, and treatment.
- **List patient files:** View and manage all patient files stored on the server.
- **Download patient files:** Download selected patient files for offline access.

## Dependencies
There are no additional dependencies noted in the current project files. The application uses built-in Java libraries.

## Project Structure
```
hospital-file-management-system/
├── CreatePatientDialog.java       # Dialog for creating a new patient file
├── FileBrowserPanel.java          # Panel for browsing and downloading patient files
├── MainForm.java                  # Main GUI application window
├── PatientFile.java               # Model class for patient data
├── PatientFileManager.java         # Remote interface for patient file management
├── PatientFileManagerImpl.java    # Implementation of the patient file management logic
├── RMIHelper.java                 # Helper class to handle RMI connections
├── Server.java                    # Entry point for the RMI server
└── HospitalSystemTest.java        # Entry point for launching both server and client
```

## Conclusion
The Hospital File Management System is an efficient way to manage patient files through a simple interface implemented in Java using RMI technology. Feel free to contribute to the project by submitting issues and pull requests.
```