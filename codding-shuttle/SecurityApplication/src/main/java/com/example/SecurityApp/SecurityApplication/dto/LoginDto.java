package com.example.SecurityApp.SecurityApplication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDto {
    @Email(message = "Invalid Email!!")
    private String email;

    @NotBlank(message = "Password should not be blank!!")
    private String password;
}
