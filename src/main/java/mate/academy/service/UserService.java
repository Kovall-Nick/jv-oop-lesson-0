package mate.academy.service;

import mate.academy.model.User;

public class UserService {
    private static final User[] users = new User[] {
            new User("bob@i.ua", "1234"),
            new User("alice@i.ua", "1234")
    };

    /*
 Знайти користувача за електронною поштою. Усі користувачі зберігаються
 в <code>private static final User[] users</code>
 @param email - вхідний параметр
  @return - користувач, якщо його електронна пошта дорівнює переданій електронній пошті.
 Повернути <code>null</code>, якщо підходящого користувача немає
 */
    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
