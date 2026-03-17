package com.examples3;

public class Button extends Widget{
	private String label;
	
	public Button(Theme theme, String label) {
		super(theme);
		this.label = label;
	}

	@Override
	public void render() {
		theme.applyButtonStyle(label);
	}

}
