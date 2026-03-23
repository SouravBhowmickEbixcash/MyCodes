package com.example3;

import java.util.ArrayList;
import java.util.List;

public class ParticleSystem {
	private List<Particle> particles;
	private ParticleTypeFactory particleTypeFactory;
	
	
	public ParticleSystem () {
		this.particles = new ArrayList<>();
		this.particleTypeFactory = new ParticleTypeFactory();
	}
	
	
	public void emit(String name, String color, String sprite, String blendMode,
            double x, double y, double vx, double vy, double lifetime) {
		ParticleType type = particleTypeFactory.getType(name, color, sprite, blendMode);
		this.particles.add(new Particle(type, x, y, vx, vy, lifetime));
	}
	
    public void renderAll() {
        // TODO: Draw all particles, then print total count and unique type count
        // Example: "Total particles: 8"
        //          "Unique particle types: 4"
    	
    	for(Particle p : particles) {
    		p.draw();
    	}
    	
    	System.out.println("Total particles: " + particles.size());
    	System.out.println("Unique particle types: " + particleTypeFactory.getTypeCount());
    }
}
