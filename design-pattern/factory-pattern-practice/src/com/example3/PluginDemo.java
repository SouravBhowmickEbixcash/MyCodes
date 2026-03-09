package com.example3;

public class PluginDemo {

	public static void main(String[] args) {
		
        PluginCreatorRegistry registry = new PluginCreatorRegistry();
        registry.register("logger", new LoggerPluginCreator());
        registry.register("validator", new ValidatorPluginCreator());
        registry.register("transformer", new TransformerPluginCreator());
        
        String[] pluginNames = {"logger", "validator", "transformer"};
        for (String name : pluginNames) {
        	PluginCreator creator = registry.getCreator(name);
        	creator.run("Hello World");
        }

	}

}
