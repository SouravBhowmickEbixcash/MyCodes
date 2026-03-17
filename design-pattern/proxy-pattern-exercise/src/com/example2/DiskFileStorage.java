package com.example2;

public class DiskFileStorage implements FileStorage{

	@Override
	public String read(String path) {
		System.out.println("DiskStorage: Reading from " + path);
		return "Contents of " + path;
	}

	@Override
	public void write(String path, String content) {
		System.out.println("DiskStorage: Writing to " + path + " : " + content);
		
	}

}
