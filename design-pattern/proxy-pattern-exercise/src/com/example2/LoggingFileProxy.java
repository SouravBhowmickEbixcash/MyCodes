package com.example2;

public class LoggingFileProxy implements FileStorage{

	private FileStorage fileStorage;
	private String fixedTimestamp = "2024-01-15 10:30:00";
	
	public LoggingFileProxy (FileStorage fileStorage) {
		this.fileStorage = fileStorage;
	} 
	
	@Override
	public String read(String path) {
		System.out.println("[" + fixedTimestamp + "] READ : " + path);
		return fileStorage.read(path);
	}

	@Override
	public void write(String path, String content) {
		System.out.println("[" + fixedTimestamp + "] WRITE : " + path);
		fileStorage.write(path, content);
		
	}

}
