package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    private final UserService userService = new UserService();
    /**
     Уявіть, що деякий користувач хоче увійти на ваш сайт.
     Ви повинні перевірити, чи є облікові дані користувача (логін і пароль)
     дійсними.
     Усі користувачі зберігаються в класі <code>UserService</code>.
     @param email - електронна пошта користувача
     @param password - пароль користувача
     @return true, якщо користувач з такою електронною поштою існує,
     а введений пароль відповідає паролю користувача.
     Повертає false в будь-яких інших випадках.
     */

    public boolean login(String email, String password) {
        User user = userService.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
