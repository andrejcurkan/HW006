package homework;


public class Main {
    public static void main(String[] args) {
        User user = new User("Bob", new DatabasePersister());
        user.report();
        user.save();
    }
}
