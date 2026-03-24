package com.example.SecurityApp.SecurityApplication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SignUpDto {
    @Email(message = "Email is invalid!!")
    private String email;

    @NotBlank(message = "Name should not be blank!!")
    private String name;

    @NotBlank(message = "Password should not be blank!!")
//    @Pattern(
//            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,}$",
//            message = "Password must be at least 8 characters long and include uppercase, lowercase, and special character"
//    )
    private String password;
}
