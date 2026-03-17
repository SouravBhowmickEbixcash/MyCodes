package com.examples2;

public class MongoDriver implements DatabaseDriver{

	@Override
	public void connect() {
		System.out.println("Mongo : Connected!!");
		
	}

	@Override
	public String execute(String query) {
		System.out.println("Mongo : Executing : " + query);
		return "mongo_result";
	}

	@Override
	public void close() {
		System.out.println("Mongo : Connection closed!!");
		
	}

}
