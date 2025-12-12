package com.example.springbootwebtutorial.dto;

import com.example.springbootwebtutorial.annotations.DepartmentTypeValidation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {

    private Long id;

    @NotBlank(message = "Department Title should not be blank")
    private String title;

//    @NotBlank(message = "Type of the department should not be blank")
    @DepartmentTypeValidation
    private String type;

    @JsonProperty("active")
    @NotNull(message = "Active status should not be empty or null")
    private Boolean isActive;

    @PastOrPresent(message = "Created At date should be past or present date.")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdAt;

}
