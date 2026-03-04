package com.example2;

public class Logger {
	
	public enum Level {
		DEBUG, INFO, WARN, ERROR
	}
	
	private Level minLevel;
	private static Logger instance = null;
	
	private Logger () {
		this.minLevel = Level.INFO;
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			synchronized (Logger.class) {
				if(instance == null) {
					instance = new Logger();
				}
			}
		}
		
		return instance;
	}
	
	
	public void setLevel(Level level) {
		this.minLevel = level;
	}
	
	
	private void log(Level level, String msg) {
		if(level.ordinal() >= minLevel.ordinal()) {
			System.out.println("[" + level.name() + "] " +  msg);
		}
	}
	
	
	public void debug(String msg) {
		log(Level.DEBUG, msg);
	}
	
	public void info(String msg) {
		log(Level.INFO, msg);
	}
	
	public void warn (String msg) {
		log(Level.WARN, msg);
	}
	
	public void error (String msg) {
		log(Level.ERROR, msg);
	}

}
