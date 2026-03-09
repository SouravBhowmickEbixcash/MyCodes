package com.example3;

public abstract class PluginCreator {
	
	public abstract Plugin createPlugin();
	
	public void run(String input) {
		Plugin plugin = createPlugin();
		plugin.initialize();
		plugin.execute(input);
		System.out.println("Plugin [" + plugin.getName() + "] executed...");
		System.out.println();
	}

}
