public class UserController implements UserStorage{
    UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public void store(User user) {
        userStorage.store(user);
    }
}
