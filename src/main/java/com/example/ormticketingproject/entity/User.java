package com.example.ormticketingproject.entity;

import com.example.ormticketingproject.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "role-id")
    private Role role;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
