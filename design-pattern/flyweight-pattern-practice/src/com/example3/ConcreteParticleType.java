package com.example3;

public class ConcreteParticleType implements ParticleType{
	private final String name;
	private final String color;
	private final String sprite;
	private final String blendMode;
	
	
	public ConcreteParticleType(String name, String color, String sprite, String blendMode) {
		this.name = name;
		this.color = color;
		this.sprite = sprite;
		this.blendMode = blendMode;
	}


	@Override
	public void render(double x, double y, double lifetime) {
		System.out.println("["+ name + "] (" + color + ", " + sprite + ", " + blendMode + ") at (" + x + "," + y + ") life=" + lifetime);
		
	}
	
	
	
}
