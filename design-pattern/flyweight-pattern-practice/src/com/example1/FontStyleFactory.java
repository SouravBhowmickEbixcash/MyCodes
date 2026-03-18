package com.example1;

import java.util.HashMap;
import java.util.Map;

public class FontStyleFactory {
	private Map<String, FontStyle> factory;
	
	public FontStyleFactory() {
		this.factory = new HashMap<>();
	}
	
	public FontStyle getFontStyle(String fontFamily, int fontSize, boolean bold, boolean italic) {
		String chacheKey = fontFamily + "_" + fontSize + "_" + (bold ? "bold" : "") + "_" + (italic ? "italic" : "");
		if(factory.containsKey(chacheKey)) {
			return factory.get(chacheKey);
		}
		
		factory.putIfAbsent(chacheKey, new ConcreteFontStyle(fontFamily, fontSize, bold, italic));
		
		return factory.get(chacheKey);
	}
	
	
	public int getStyleCount() {
		return factory.size();
	}
}
