package com.examples.impl;

import com.examples.interfaces.TextDecorator;
import com.examples.interfaces.TextView;

public class ItalicDecorator extends TextDecorator{

	public ItalicDecorator(TextView textView) {
		super(textView);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.print("<i>");
		super.textView.render();
		System.out.print("</i>");
		
	}

}
