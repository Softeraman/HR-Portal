package com.hrmanagement.backend.repository;

import com.hrmanagement.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}