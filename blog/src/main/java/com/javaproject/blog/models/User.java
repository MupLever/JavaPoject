package com.javaproject.blog.models;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    private String username;
    private String password;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch= FetchType.LAZY)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public String getUsername() { return this.username; }
    public String getPassword() { return password;      }
    public Set<Role> getRoles() { return roles;         }

    public void setUsername(final String username) { this.username = username; }
    public void setPassword(String password)       { this.password = password; }
    public void setActive(boolean active)          { this.active = active;     }
    public void setRoles(Set<Role> roles)          { this.roles = roles;       }

    public boolean isActive() { return active; }


}

