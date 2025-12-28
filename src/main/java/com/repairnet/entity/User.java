package com.repairnet.entity;

import com.repairnet.enumm.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "email boş ola bilməz")
    @Email(message = "email formatı düzgün deyil")
    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 8,message ="şifrə ən azı 8 simvol olmalıdır ")
    @Column(nullable = false)
    private String password;

    private String username;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    //getter and setter
    //-----------------------------------------------------------------------//

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String fullName) {
        this.username = fullName;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public User setRole(UserRole role) {
        this.role = role;
        return this;
    }
}
