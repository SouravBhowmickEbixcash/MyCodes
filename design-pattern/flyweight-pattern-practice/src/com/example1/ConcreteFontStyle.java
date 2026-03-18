package com.example1;

public class ConcreteFontStyle implements FontStyle{
	private final String fontFamily;
	private final int fontSize;
	private final boolean bold;
	private final boolean italic;
	
	public ConcreteFontStyle(String fontFamily, int fontSize, boolean bold, boolean italic) {
		this.fontFamily = fontFamily;
		this.fontSize = fontSize;
		this.bold = bold;
		this.italic = italic;
	}
	
	@Override
	public void format(int line, int column, char character) {
		String style = "normal";
		if(bold && italic) {
			style = "bold_italic";
		}else if(bold) {
			style = "bold";
		}else if(italic) {
			style = "italic";
		}
		
		System.out.println("[" + fontFamily + ", " + fontSize + ", " + style + "] " + character + " at " + line + ":" + column);
		
	}

}
