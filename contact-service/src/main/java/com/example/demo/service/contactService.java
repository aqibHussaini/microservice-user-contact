package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Contact;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class contactService {
    private List<Contact> contactList;

    public contactService(List<Contact> contactList) {
        Contact contact = new Contact(1, "0331-9747411", 1, "aqib");
        Contact contact1 = new Contact(2, "0331-9747411", 1, "aqib");
        Contact contact2 = new Contact(3, "0331-9747411", 2, "kaku");
        Contact contact3 = new Contact(4, "0331-9747411", 2, "kaku");
        Contact contact5 = new Contact(5, "0331-9747411", 3, "mana");
        Contact contact6 = new Contact(6, "0331-9747411", 3, "mana");
        contactList.add(contact);
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact5);
        contactList.add(contact6);
        this.contactList = contactList;
    }

    public List<Contact> getAllContacts() {
        return this.contactList;
    }

    public List<Contact> getAllContactsByUser(int user_id) {
        return this.contactList.stream().filter(c ->c.getUser_id() == user_id).collect(Collectors.toList());
    }
}
