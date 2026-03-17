package com.examples3;

public class Checkbox extends Widget{
	private String label;
	private boolean isChecked;
	
	public Checkbox(Theme theme, String label, boolean isChecked) {
		super(theme);
		this.label = label;
		this.isChecked = isChecked;
	}

	@Override
	public void render() {
		theme.applyCheckboxStyle(label, isChecked);
	}

}
