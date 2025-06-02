package com.eliza.jdbcTemplate.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ReaderDto {

    @NotEmpty(message = "Name should not be empty")
    @Size(max = 100, message = "Title should not exceed 100 characters")
    private String name;

    @Size(max = 100, message = "Title should not exceed 100 characters")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    private Long phone;
    private LocalDate registrationDate;

    public ReaderDto() {
    }

    public ReaderDto(String name, String email, Long phone, LocalDate registrationDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.registrationDate = registrationDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
