package com.okta.developer.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.okta.developer.demo.entity.*;
import com.okta.developer.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @GetMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Login> getLogin() {
        return loginRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping(path = "/login/{loginId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Login getOneLogin(@PathVariable Long loginId){ return loginRepository.findById(loginId).get();
    }

    @PostMapping(path ="/login/{emailInput}/{passwordInput}")
    public Login newLogin(@RequestBody Login login,
                          @PathVariable String emailInput,
                          @PathVariable String passwordInput
    ) {
        Login c = new Login();
        c.setEmail(emailInput);
        c.setPassword(passwordInput);
        return loginRepository.save(c);
    }
}