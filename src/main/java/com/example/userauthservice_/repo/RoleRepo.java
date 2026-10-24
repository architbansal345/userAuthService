package com.example.userauthservice_.repo;

import com.example.userauthservice_.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
}
