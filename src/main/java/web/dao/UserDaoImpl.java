package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void createUser(User user) {
        em.persist(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return em.createQuery("select user from User user", User.class)
                .getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(int id) {
        return em.find(User.class, id);
    }
    @Override
    @Transactional
    public void updateUser(int id, User user) {
        User userToUpdate = em.find(User.class, id);
        userToUpdate.setName(user.getName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setAge(user.getAge());
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }
}
