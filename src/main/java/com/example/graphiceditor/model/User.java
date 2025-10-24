package com.example.graphiceditor.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String username;
    private String passwordHash;
    private boolean authorized;

    // Користувач може мати кілька проєктів
    private List<Project> projects = new ArrayList<>();

    public User() {}

    public User(Long id, String username, String passwordHash, boolean authorized) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.authorized = authorized;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project p) {
        projects.add(p);
    }
}
