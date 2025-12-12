package com.example.springbootwebtutorial.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {DepartmentTypeValidator.class})
public @interface DepartmentTypeValidation {

    String message() default "Invalid Department Type";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
