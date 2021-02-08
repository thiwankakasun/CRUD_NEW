package com.Test;


import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "contact")
    private String Contact;

    public Customer(){}
    public Customer(Integer id, String name, String contact) {
        Id = id;
        Name = name;
        Contact = contact;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
