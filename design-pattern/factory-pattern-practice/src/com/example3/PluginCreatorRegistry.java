package com.example3;

import java.util.HashMap;
import java.util.Map;

public class PluginCreatorRegistry {
	
	private Map<String, PluginCreator> creators;
	
	
	public PluginCreatorRegistry () {
		this.creators = new HashMap<>();
	}
	
	
	public void register(String name, PluginCreator pluginCreator) {
		creators.put(name, pluginCreator);
	}
	
	public PluginCreator getCreator(String name) {
		if(!creators.containsKey(name)) {
			throw new IllegalArgumentException("Plugin not Registered: " + name);
		}
		
		return creators.get(name);
	}
}
