package com.example.demo.Controllers;

import com.example.demo.Entitiy.Contact;
import com.example.demo.Entitiy.User;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private userService userService;

    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/get-user/{id}")
    public User getAllUsers(@PathVariable int id) {
       List contacts= this.restTemplate.getForObject("http://contact-service/contacts/get-contacts-by-user/"+id, List.class);
       User user= this.userService.getUserById(id);
       List<Contact> contacts1=new ArrayList<>();
       user.setContactList(contacts);
        return user;
    }
}
