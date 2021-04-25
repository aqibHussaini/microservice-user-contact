package com.example.demo.Entities;

public class Contact {
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }





    private String contact;
    private int user_id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(int id, String contact, int user_id, String name) {
        this.id = id;
        this.contact = contact;
        this.user_id = user_id;
        this.name = name;
    }

    public Contact(String contact, int user_id) {
        this.contact = contact;
        this.user_id = user_id;
    }

    public Contact(int id, String contact, int user_id) {
        this.id = id;
        this.contact = contact;
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contact='" + contact + '\'' +
                ", user_id=" + user_id +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
