package com.example3;

public class ParticleSystemDemo {

	public static void main(String[] args) {
        ParticleSystem system = new ParticleSystem();
        system.emit("fire", "orange", "fire.png", "additive", 100, 200, 0, -2, 1.0);
        system.emit("fire", "orange", "fire.png", "additive", 105, 205, 0.5, -1.8, 0.8);
        system.emit("smoke", "gray", "smoke.png", "alpha", 100, 180, 0.2, -1, 2.0);
        system.emit("spark", "yellow", "spark.png", "additive", 110, 210, 1, -3, 0.3);
        system.emit("fire", "orange", "fire.png", "additive", 95, 195, -0.3, -2.2, 1.2);
        system.emit("smoke", "gray", "smoke.png", "alpha", 98, 185, -0.1, -0.8, 2.5);
        system.emit("snow", "white", "snow.png", "alpha", 200, 0, 0.1, 1, 5.0);
        system.emit("snow", "white", "snow.png", "alpha", 250, 10, -0.2, 0.8, 4.5);
        system.renderAll();

	}

}
