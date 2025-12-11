package com.example.springbootwebtutorial.dto;

import com.example.springbootwebtutorial.annotations.EmployeeRoleValidation;
import com.example.springbootwebtutorial.annotations.PrimeNumberValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Name of the Employee cannot be empty")
    @Size(min = 3, max = 10, message = "Number of characters should be in the range: [3-10]")
    private String name;

    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "Age cannot be blank")
    @Max(value = 80, message = "Age of Employee cannot be greater than 80")
    @Min(value = 18, message = "Age of Employee cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of the employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "The role of Employee can either be USER or ADMIN")
    @EmployeeRoleValidation
    private String role; //ADMIN, USER

    @NotNull(message = "Salary of the employee should not be empty")
    @Positive(message = "Salary of employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in the form xxxxx.yy")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "The joining date should be in the past or present")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("active")
    private Boolean isActive;

    @NotNull(message = "Favourite Prime Number should not be blank.")
    @PrimeNumberValidation
    private Integer favPrimeNo;
}
