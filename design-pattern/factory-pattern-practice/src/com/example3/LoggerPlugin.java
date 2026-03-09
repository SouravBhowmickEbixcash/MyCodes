package com.example3;

public class LoggerPlugin implements Plugin{

	@Override
	public void initialize() {
		System.out.println("[Logger] Initialized...");
	}

	@Override
	public String execute(String input) {
		System.out.println("[Logger] Logging: " + input);
		return input;
	}

	@Override
	public String getName() {
		return "Logger";
	}

}
