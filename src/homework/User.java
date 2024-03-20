package homework;


public class User {
    private final String name;
    private final Persister persister;

    public User(String name, Persister persister) {
        this.name = name;
        this.persister = persister;
    }

    public String getName() {
        return name;
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }

    public void save() {
        persister.save(this);
    }
}
