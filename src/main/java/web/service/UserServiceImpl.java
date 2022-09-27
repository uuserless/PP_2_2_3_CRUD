package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
