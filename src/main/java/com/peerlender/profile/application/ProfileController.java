package com.peerlender.profile.application;

import com.peerlender.profile.domain.model.User;
import com.peerlender.profile.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    private final UserRepository userRepository;

    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/users")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/user")
    public void newUser(@RequestBody final User user) {
        user.setRegistrationSince(LocalDate.now());
        userRepository.save(user);
    }

    @PutMapping(value = "/user")
    public void updateUser(@RequestBody final User user) {
        userRepository.save(user);
    }
}
