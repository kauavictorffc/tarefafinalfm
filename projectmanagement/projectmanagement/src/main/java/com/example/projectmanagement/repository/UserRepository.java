package com.example.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projectmanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
