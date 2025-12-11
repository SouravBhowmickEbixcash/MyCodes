package com.example.springbootwebtutorial.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PrimeNumberValidator implements ConstraintValidator<PrimeNumberValidation, Integer> {
    /**
     * Implements the validation logic.
     * The state of {@code value} must not be altered.
     * <p>
     * This method can be accessed concurrently, thread-safety must be ensured
     * by the implementation.
     *
     * @param value   object to validate
     * @param context context in which the constraint is evaluated
     * @return {@code false} if {@code value} does not pass the constraint
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        //corner case
        if(value <= 1){
            return false;
        }

        //check from 2
        for(int i = 2; i <= Math.sqrt(value); i++){
            if(value%i == 0){
                return false;
            }
        }

        return true;
    }
}
