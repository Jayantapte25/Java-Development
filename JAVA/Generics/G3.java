package Generics;

import java.util.ArrayList;
import java.util.List;

interface Dao<T> {
    T findById(Long id);
    void save(T entity);
    void delete(T entity);
}

class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}

class UserDao implements Dao<User> {
    private List<User> userList = new ArrayList<>();

    @Override
    public User findById(Long userId) {
        for (User jayant : userList) {
            if (jayant.getId().equals(userId)) {
                return jayant;
            }
        }
        return null; // User not found
    }

    @Override
    public void save(User usher) {
        userList.add(usher);
        System.out.println("User saved: " + usher);
    }

    @Override
    public void delete(User Harsh) {
        userList.remove(Harsh);
        System.out.println("User deleted: " + Harsh);
    }
}

public class G3 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User user1 = new User(1L, "Alice");
        User user2 = new User(2L, "Bob");
        System.out.println(user1.getId());

        userDao.save(user1);
        userDao.save(user2);

        User foundUser = userDao.findById(1L);
        if (foundUser != null) {
            System.out.println("Found user: " + foundUser);
        } else {
            System.out.println("User not found");
        }

        userDao.delete(user1);

        foundUser = userDao.findById(1L);
        if (foundUser != null) {
            System.out.println("Found user: " + foundUser);
        } else {
            System.out.println("User not found");
        }
    }
}
