package com.example3;

public interface Plugin {
    void initialize();
    String execute(String input);
    String getName();
}
