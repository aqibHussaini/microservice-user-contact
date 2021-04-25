package com.example.demo.Entitiy;

public class Contact {
    private  int id;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contact='" + contact + '\'' +
                ", user=" + user +
                '}';
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contact(String contact, User user) {
        this.contact = contact;
        this.user = user;
    }

    private String contact;
    private User user;

    public Contact(int id, String contact, User user) {
        this.id = id;
        this.contact = contact;
        this.user = user;
    }
}
