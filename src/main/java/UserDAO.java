import java.util.List;

public interface UserDAO {
    public boolean create(User user);
    public User read(int id);
    public boolean update(int id, User user);
    public boolean delete(int id);
    public List<User> readAll();



}
