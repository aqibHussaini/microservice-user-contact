package com.example.demo.Controllers;

import com.example.demo.Entities.Contact;
import com.example.demo.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/contacts")
public class contactController {
    @Autowired
    contactService contactService;
    @GetMapping("/get-contacts")
    public List<Contact> getAllContacts()
    {
      return   this.contactService.getAllContacts();
    }
    @GetMapping("/get-contacts-by-user/{user_id}")
    public List<Contact> getAllContactsByUser(@PathVariable  int user_id)
    {
      return   this.contactService.getAllContactsByUser(user_id);
    }
}
