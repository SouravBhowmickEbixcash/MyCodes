package com.example3;

public class Particle {
	private ParticleType particleType;
	private double x;
	private double y;
	private double vx;
	private double vy;
	private double lifetime;
	
	
	public Particle(ParticleType particleType, double x, double y, double vx, double vy, double lifetime) {
		this.particleType = particleType;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.lifetime = lifetime;
	}
	
	
	public void draw() {
		this.particleType.render(vx, vy, lifetime);
	}
}
