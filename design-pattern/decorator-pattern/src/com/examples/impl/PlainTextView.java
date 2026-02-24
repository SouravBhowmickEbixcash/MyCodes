package com.examples.impl;

import com.examples.interfaces.TextView;

public class PlainTextView implements TextView{
	
	private String text;
	
	public PlainTextView (String text) {
		this.text = text;
	}

	@Override
	public void render() {
		System.out.print(text);
		
	}
	
}
