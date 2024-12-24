package com.example.zalominiapp.miniapp.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
@Data // Lombok annotation for getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Lombok constructor with no args
@AllArgsConstructor // Lombok constructor with all args
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String passwordHash;
    private String address;
    private String phoneNumber;

    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
