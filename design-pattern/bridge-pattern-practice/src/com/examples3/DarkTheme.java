package com.examples3;

public class DarkTheme implements Theme{

	@Override
	public void applyButtonStyle(String label) {
		System.out.println("[Dark] Button : {" + label + "} | bg=#1a1a2e, text=#ffffff");
	}

	@Override
	public void applyTextFieldStyle(String placeholder) {
		System.out.println("[Dark] TextField : {" + placeholder + "} | bg=#1a1a2e, text=#ffffff");
	}

	@Override
	public void applyCheckboxStyle(String label, boolean checked) {
		System.out.println("[Dark] Checkbox : {" + label + "} [" + (checked ? "x" : " " ) + "] | bg=#1a1a2e, text=#ffffff");
	}

}
