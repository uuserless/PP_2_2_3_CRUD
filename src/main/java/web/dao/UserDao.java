package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

}
