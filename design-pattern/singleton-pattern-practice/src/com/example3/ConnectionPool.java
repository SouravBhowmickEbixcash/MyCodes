package com.example3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
	
    private final BlockingQueue<Connection> pool;
    private final int maxConnections;
    private static ConnectionPool instance = null;
    
    
    public static class Connection {
    	private final int id;
    	
    	Connection (int id){
    		this.id = id;
    	}
    	
    	public int getId() {
    		return id;
    	}
    	
        @Override
        public String toString() { 
        	return "Connection-" + id; 
        }

    }
    
    
    private ConnectionPool(int maxConnections) {
        this.maxConnections = maxConnections;
        this.pool = new LinkedBlockingQueue<>(maxConnections);
        for(int i = 1; i <= maxConnections; i++) {
        	this.pool.add(new Connection(i));
        }
    }
    
    
    public static ConnectionPool getInstance() {
    	if(instance == null) {
    		synchronized (ConnectionPool.class) {
				if(instance == null) {
					instance = new ConnectionPool(5);
				}
			}
    	}
    	
    	return instance;
    }
    
    
    public Connection getConnection() throws InterruptedException{
    	return this.pool.take();
    }
    
    
    public void releaseConnection(Connection connection) {
    	this.pool.offer(connection);
    }
    
    public int getAvailableCount() {
    	return this.pool.size();
    }
}
