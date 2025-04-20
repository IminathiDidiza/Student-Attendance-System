package za.ac.cput.Factory;

import za.ac.cput.Util.Helper;

public class StudentFactory {

    private String email;

    public void updateEmail(String newEmail) {
        if (Helper.isValidEmail(newEmail)) {
            this.email = newEmail;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
