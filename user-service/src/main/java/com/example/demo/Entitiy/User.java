package com.example.demo.Entitiy;

import java.util.List;

public class User {
    private int id;
    private String name,email;
    private List<Contact> contactList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactList=" + contactList +
                '}';
    }

    public User(String name, String email, List<Contact> contactList) {
        this.name = name;
        this.email = email;
        this.contactList = contactList;
    }

    public User(int id, String name, String email, List<Contact> contactList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactList = contactList;
    }
}
