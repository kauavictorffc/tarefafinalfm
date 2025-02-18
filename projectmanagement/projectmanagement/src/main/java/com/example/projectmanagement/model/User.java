package com.example.projectmanagement.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String responsibility;

    private String firm;

    @OneToMany(mappedBy = "assignedUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

    public User() {}

    public User(String name, String email, String responsibility, String firm) {
        this.name = name;
        this.email = email;
        this.responsibility = responsibility;
        this.firm = firm;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) 
