public class XMLStorage implements UserStorage {
    UserStorage userStorage;

    @Override
    public void store(User user) {
        System.out.println("XML");
    }
}
