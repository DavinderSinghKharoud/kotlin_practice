package google_kotlin_from_java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UseCase {
    public static User registerGuest(String name) {
        User guest = new User(Repository.getNextGuestId(), StringUtils.nameToLogin(name), name);
        Repository.addUser(guest);
        return guest;
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
        } catch (IOException e) {
            // Log exception.
        }
    }
}