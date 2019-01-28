package com.okta.developer.demo.entity;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Getter @Setter
@ToString
@EqualsAndHashCode
@Table (name="Login")
public class Login {

    @Id
    @SequenceGenerator(name="login_seq",sequenceName="login_seq")
    @GeneratedValue(generator="login_seq",strategy=GenerationType.SEQUENCE)
    @Column(name="LOGIN_ID",unique = true, nullable = true)

    private Long loginId;
    @NonNull private String login;
    @NonNull private String phone;
    @NonNull private String email;
    @NonNull private String password;

    public Login(String phone, String email, String password) {
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}