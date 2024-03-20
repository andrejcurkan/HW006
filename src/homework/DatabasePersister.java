package homework;


public class DatabasePersister implements Persister {
    public void save(User user) {
        System.out.println("Save user to database: " + user.getName());
    }
}
