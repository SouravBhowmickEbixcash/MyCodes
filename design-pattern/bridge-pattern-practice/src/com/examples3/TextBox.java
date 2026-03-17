package com.examples3;

public class TextBox extends Widget{
	private String placeholder;
	
	public TextBox(Theme theme, String placeholder) {
		super(theme);
		this.placeholder = placeholder;
	}

	@Override
	public void render() {
		theme.applyTextFieldStyle(placeholder);
	}

}
