package com.examples3;

public class ThemeEngineDemo {

	public static void main(String[] args) {
        Theme dark = new DarkTheme();
        Theme light = new LightTheme();
        Widget btn = new Button(dark, "Submit");
        Widget txt = new TextBox(light, "Enter name...");
        Widget chk = new Checkbox(dark, "Remember me", true);
        btn.render();
        txt.render();
        chk.render();

	}

}
