package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
///poderemos usar uma cadeia de metodos com a extensão de interface JPA
public interface UserRepository extends JpaRepository<User, Integer> {
}
