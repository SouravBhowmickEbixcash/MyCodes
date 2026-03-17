package com.example2;

public class FileSystemDemo {

	public static void main(String[] args) {
		FileStorage storage = new DiskFileStorage();// Replace with LoggingFileProxy
		FileStorage loggingProxy = new LoggingFileProxy(storage);

        loggingProxy.write("/docs/readme.txt", "Hello World");
        System.out.println(storage.read("/docs/readme.txt"));
        loggingProxy.write("/docs/config.json", "{\"key\": \"value\"}");
        System.out.println(storage.read("/docs/config.json"));

	}

}
