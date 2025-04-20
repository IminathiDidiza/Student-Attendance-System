package za.ac.cput.Domain;

public class Instructor {
    private String instructorId;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String department;

    public Instructor(String instructorId, String firstName, String lastName, String email, String contactNumber, String department) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.department = department;
    }

    // Getters and Setters
    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Optional: Method to display info
    public void displayInfo() {
        System.out.println("Instructor: " + firstName + " " + lastName + ", Email: " + email);
    }
}
