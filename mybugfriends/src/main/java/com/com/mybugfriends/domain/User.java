package com.com.mybugfriends.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "adminUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "aUsername", unique = true)
    @NotBlank(message = "aUsername is needed")
    private String aUsername;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "password is needed")
    private String password;

    public User() {
    }

    public User(String aUsername, String password) {
        super();
        this.aUsername = aUsername;
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return aUsername;
    }

    public void setUsername(String aUsername) {
        this.aUsername = aUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}