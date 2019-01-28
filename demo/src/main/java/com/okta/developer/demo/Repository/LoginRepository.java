package com.okta.developer.demo.repository;

import com.okta.developer.demo.entity.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin(origins = "http://localhost:8090")
@RepositoryRestResource
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findBylogin (String login);
}