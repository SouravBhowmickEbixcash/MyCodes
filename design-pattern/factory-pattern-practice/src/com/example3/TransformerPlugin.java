package com.example3;

public class TransformerPlugin implements Plugin{

	@Override
	public void initialize() {
		System.out.println("[Transformer] Initialized...");
	}

	@Override
	public String execute(String input) {
		String result = input.toUpperCase();
		System.out.println("[Transformer] Result: " + result);
        return result;
	}

	@Override
	public String getName() {
		return "Transformer";
	}

}
