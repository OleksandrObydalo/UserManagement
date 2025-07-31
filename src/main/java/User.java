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
}
