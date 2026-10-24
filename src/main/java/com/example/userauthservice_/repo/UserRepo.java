package com.example.userauthservice_.repo;

import com.example.userauthservice_.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
