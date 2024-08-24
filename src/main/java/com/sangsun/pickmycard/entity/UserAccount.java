package com.sangsun.pickmycard.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "userAccount", cascade = CascadeType.ALL)
    private List<UserPreference> preferences;
}