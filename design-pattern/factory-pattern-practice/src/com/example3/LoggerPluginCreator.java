package com.example3;

public class LoggerPluginCreator extends PluginCreator{

	@Override
	public Plugin createPlugin() {
		return new LoggerPlugin();
	}

}
