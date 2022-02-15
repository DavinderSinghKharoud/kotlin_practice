package google_course.convert_to_kotlin;

import java.util.ArrayList;
import java.util.List;

public class Repository1 {

    private static Repository1 INSTANCE = null;

    private List<User1> users = null;

    public static Repository1 getInstance() {
        if (INSTANCE == null) {
            synchronized (Repository1.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Repository1();
                }
            }
        }
        return INSTANCE;
    }

    // keeping the constructor private to enforce the usage of getInstance
    private Repository1() {

        User1 user1 = new User1("Jane", "");
        User1 user2 = new User1("John", null);
        User1 user3 = new User1("Anne", "Doe");

        users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User1> getUsers() {
        return users;
    }

    public List<String> getFormattedUserNames() {
        List<String> userNames = new ArrayList<>(users.size());
        for (User1 user : users) {
            String name;

            if (user.getLastName() != null) {
                if (user.getFirstName() != null) {
                    name = user.getFirstName() + " " + user.getLastName();
                } else {
                    name = user.getLastName();
                }
            } else if (user.getFirstName() != null) {
                name = user.getFirstName();
            } else {
                name = "Unknown";
            }
            userNames.add(name);
        }
        return userNames;
    }
}