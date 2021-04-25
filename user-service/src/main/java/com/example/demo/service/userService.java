package com.example.demo.service;

import com.example.demo.Entitiy.Contact;
import com.example.demo.Entitiy.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService {
    private List<User> users;
    public userService(List<User> users) {

        List<Contact> contacts = new ArrayList<>();
        User user = new User(1, "ali", "ali@gmail.com", contacts);
        User u1 = new User(2, "waqas", "waqas@gmail.com", contacts);
        User u2 = new User(3, "alian", "alian@gmail.com", contacts);
        User u3 = new User(4, "hassan", "hassan@gmail.com", contacts);
        users.add(user);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        this.users = users;
    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public User getUserById(int id) {
        return this.users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
}
