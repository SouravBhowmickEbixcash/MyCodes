package com.examples2;

public abstract class Repository {
	
	protected DatabaseDriver driver;
	
	
	public Repository(DatabaseDriver driver) {
		this.driver = driver;
	}
}
