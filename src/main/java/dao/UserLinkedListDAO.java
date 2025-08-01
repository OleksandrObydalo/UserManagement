package dao;

import model.User;

import java.util.LinkedList;
import java.util.List;

public class UserLinkedListDAO implements UserDAO {

    private static UserLinkedListDAO userDAOInstance = null;

    private UserLinkedListDAO() {

    }

    public static UserLinkedListDAO getInstance(){
        if(userDAOInstance == null){
            userDAOInstance = new UserLinkedListDAO();
        }
        return userDAOInstance;
    }

    private List<User> users = new LinkedList<>();
    @Override
    public boolean create(User user){
        if(user != null){
            return users.add(user);
        }
        return false;
    }
    @Override
    public User read(int id){
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
    @Override
    public boolean update(int id, User user){
        int index = users.indexOf(read(id));
        return users.set(index, user) != null;
    }
    @Override
    public boolean delete(int id){
        int index = users.indexOf(read(id));
        return users.remove(id) != null;
    }
    @Override
    public List<User> readAll(){
        return users;
    }
}
