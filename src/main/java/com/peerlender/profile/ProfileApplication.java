package com.peerlender.profile;

import com.peerlender.profile.domain.model.User;
import com.peerlender.profile.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProfileApplication implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {

        /*Starts the applications as you have annotated the beans with @Lazy, so it boots faster*/
        //System.setProperty("spring.main.lazy-initialization", "true");
        SpringApplication.run(ProfileApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userRepository.save(new User("John","John","Smith",27,
                "Plumber",LocalDate.now()));
        userRepository.save(new User("Anna","Anna","Brown",53,
                "Designer",LocalDate.now()));
        userRepository.save(new User("Larry","Larry","Blur",35,
                "Lawyer",LocalDate.now()));
        userRepository.save(new User("Kelly","Kelly","Chapel",19,
                "Student",LocalDate.now()));
    }
}
