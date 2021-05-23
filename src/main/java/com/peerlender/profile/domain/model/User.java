package com.peerlender.profile.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class User {

    @Id
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private LocalDate registrationSince;

    public User() {
    }

    public User(String username, String firstName, String lastName, int age, String occupation, LocalDate registrationSince) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.registrationSince = registrationSince;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public LocalDate getRegistrationSince() {
        return registrationSince;
    }

    public void setRegistrationSince(LocalDate registrationSince) {
        this.registrationSince = registrationSince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(username, user.username) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(occupation, user.occupation) && Objects.equals(registrationSince, user.registrationSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastName, age, occupation, registrationSince);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", registrationSince=" + registrationSince +
                '}';
    }
}
