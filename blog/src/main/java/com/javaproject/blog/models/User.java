package com.javaproject.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;
    private String username;


    private String email;
    private char[] password;

    final public String GetUsername() { return this.username; }
    final public String GetEmail()    { return this.email;    }

    public void SetUsername(final String username) { this.username = username; }
    public void SetEmail(final String email)       { this.email = email;       }
}

