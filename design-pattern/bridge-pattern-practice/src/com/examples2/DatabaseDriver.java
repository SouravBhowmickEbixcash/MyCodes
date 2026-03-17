package com.examples2;

public interface DatabaseDriver {
	void connect();
	String execute(String query);
	void close();
}
