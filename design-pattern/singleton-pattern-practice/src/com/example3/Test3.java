package com.example3;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
        // After implementing, usage should look like:
        ConnectionPool p1 = ConnectionPool.getInstance();
        ConnectionPool p2 = ConnectionPool.getInstance();
        System.out.println("Same instance: " + (p1 == p2));
        System.out.println("Available connections: " + p1.getAvailableCount());
        ConnectionPool.Connection c1 = p1.getConnection();
        System.out.println("Acquired: " + c1);
        ConnectionPool.Connection c2 = p1.getConnection();
        System.out.println("Acquired: " + c2);
        System.out.println("Available after acquiring 2: " + p1.getAvailableCount());
        p1.releaseConnection(c1);
        System.out.println("Released: " + c1);
        System.out.println("Available after release: " + p1.getAvailableCount());
	}

}
