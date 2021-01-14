public class Client {
    public static void main(String[] args) {
        UserController controller = new UserController(new MySQLStorage());
        User user = new User();

        controller.store(user);


    }
}
