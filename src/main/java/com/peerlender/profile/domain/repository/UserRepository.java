package com.peerlender.profile.domain.repository;

import com.peerlender.profile.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
}
