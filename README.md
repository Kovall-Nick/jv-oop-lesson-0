# Working with services

Your task is to implement a `login` method in `AuthenticationService` and `findByEmail` method in `UserService`.
More details are described in comments over the methods.

To verify your solution please run `main` method in `Main` class. The output in console should be the following:
```
Test passed for email: bob@i.ua and password 1234
Test passed for email: alice@i.ua and password 1234
Test passed for email: john@i.ua and password 1234
Test passed for email: bob@i.ua and password qwerty
```
**NOTE:** please do not modify the `Main` class.
🛠️ Деталі завдання Реалізувати метод login в класі AuthenticationService. Цей метод, ймовірно, має приймати електронну пошту (email) та пароль. Він повинен перевіряти, чи існує користувач з таким email, та чи співпадає пароль. Якщо дані коректні, метод повертає об'єкт користувача; інакше, він має обробляти ситуацію, наприклад, викидати виключення або повертати null.

Реалізувати метод findByEmail в класі UserService. Цей метод має шукати користувача за його електронною поштою (email). Він буде використовуватися методом login для перевірки існування користувача. Метод має повертати об'єкт користувача, якщо він знайдений, або null, якщо користувача з таким email не існує.

📝 Загальний план дій Відкрийте файли AuthenticationService.java та UserService.java.

У класі UserService, знайдіть метод findByEmail. Реалізуйте його логіку, яка шукає користувача в певному джерелі даних (наприклад, списку користувачів, мапі, базі даних). Якщо користувач знайдений, поверніть його об'єкт. Якщо ні — поверніть null.

У класі AuthenticationService, знайдіть метод login. У ньому вам потрібно:

Створити об'єкт класу UserService або використовувати існуючий, якщо він надається.

Викликати метод findByEmail з UserService, передавши йому email, отриманий в якості аргументу методу login.

Перевірити, чи повернув findByEmail об'єкт користувача. Якщо він повернув null, це означає, що користувача не знайдено.

Якщо користувача знайдено, перевірте, чи співпадає пароль, переданий в login, з паролем знайденого користувача.

Якщо email і пароль збігаються, поверніть об'єкт користувача.

В іншому випадку (якщо користувача не знайдено або пароль невірний), реалізуйте логіку для обробки помилки.

Збережіть зміни в обох файлах.

Запустіть метод main в класі Main, щоб перевірити, чи ваш код працює коректно. Якщо все зроблено правильно, ви побачите очікуваний вивід у консолі, який підтверджує, що всі тести пройдені.

Пам'ятайте, що клас Main змінювати не можна. Він використовує ваші реалізовані методи для перевірки.