public class User {
    private int id;
    private String name;
    private String password;

    private static int counter = 1;

    public User() {
        this.id = counter;
        counter++;
    }

    public User(String name, String password) {
        this();
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
