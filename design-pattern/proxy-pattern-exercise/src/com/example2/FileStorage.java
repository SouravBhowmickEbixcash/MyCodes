package com.example2;

public interface FileStorage {
	String read(String path);
	void write(String path, String content);
}	
