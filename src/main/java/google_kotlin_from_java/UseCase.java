package google_kotlin_from_java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UseCase {

    /**
     * @JvmStatic to generate static members and methods.
     * @JvmOverloads to generate overloaded methods for functions that have default values.
     * @JvmName to change the name of getters and setters.
     * @JvmField to expose a property directly as a field, rather than via getters and setters.
     * @Throws to declare checked exceptions.
     */
    public static User registerGuest(String name) {
        User guest = new User(Repository.getNextGuestId(), StringUtils.nameToLogin(name), name);
        Repository.addUser(guest);
        return guest;
    }

    private void testJvmOverloads() {
        User syrinx = new User(1001, "syrinx");
        User ione = new User(1002, "ione", "Ione Saldana");
        List<String> groups = new ArrayList<>();
        groups.add("staff");

        //We cannot skip third parameter in java, but in kotlin we can use named parameters call
        // User beaulieu = new User(1002, "beaulieu", groups);
    }

    public static List<User> getSystemUsers() {
        ArrayList<User> systemUsers = new ArrayList<>();
        for (User user : Repository.getUsers()) {
            if (user.hasSystemAccess()) {
                systemUsers.add(user);
            }
        }
        return systemUsers;
    }

    public static String formatUser(User user) {
        return String.format("%s (%s:%d)", user.displayName, user.username, user.id);
    }

    public static void backupUsers() {
        try {
            if (!Repository.saveAs(Repository.BACKUP_PATH)) {
                // TODO: Report error backing up user database.
            }
        } catch (IOException ignored) {

        }
    }
}