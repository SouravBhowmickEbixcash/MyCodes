package com.examples2;

public class PostgresDriver implements DatabaseDriver{

	@Override
	public void connect() {
		System.out.println("Postgres : Connected!!");
		
	}

	@Override
	public String execute(String query) {
		System.out.println("Postgres : Executing : " + query);
		return "pg_result";
	}

	@Override
	public void close() {
		System.out.println("Postgres : Connection closed!!");
		
	}

}
