package com.examples3;

public class LightTheme implements Theme{

	@Override
	public void applyButtonStyle(String label) {
		System.out.println("[Light] Button : {" + label + "} | bg=#ffffff, text=#1a1a2e");
	}

	@Override
	public void applyTextFieldStyle(String placeholder) {
		System.out.println("[Light] textField : {" + placeholder + "} | bg=#ffffff, text=#1a1a2e");
	}

	@Override
	public void applyCheckboxStyle(String label, boolean checked) {
		System.out.println("[Light] Checkbox : {" + label + "} [" + (checked ? "x" : " ") + "] | bg=#ffffff, text=#1a1a2e");
	}

}
