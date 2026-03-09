package com.example3;

public class ValidatorPlugin implements Plugin{

	@Override
	public void initialize() {
		System.out.println("[Validator] Initialized...");
		
	}

	@Override
	public String execute(String input) {
		boolean valid = input.isEmpty() ? false : true;
		if(valid) {
			System.out.println("[Validator] Input \"[input]\" is valid.");
			return "valid";
		}
		System.out.println("[Validator] Input \"[input]\" is invalid.");
		return "invalid";
        
	}

	@Override
	public String getName() {
		return "Validator";
	}

}
