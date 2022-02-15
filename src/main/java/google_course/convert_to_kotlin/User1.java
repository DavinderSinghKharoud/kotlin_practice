package google_course.convert_to_kotlin;

import org.jetbrains.annotations.Nullable;

public class User1 {

    @Nullable
    private String firstName;
    @Nullable
    private String lastName;

    public User1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

}