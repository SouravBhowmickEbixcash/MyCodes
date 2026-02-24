package com.examples.impl;

import com.examples.interfaces.TextDecorator;
import com.examples.interfaces.TextView;

public class UnderlineDecorator extends TextDecorator{

	public UnderlineDecorator(TextView textView) {
		super(textView);
	}

	@Override
	public void render() {
		System.out.print("<u>");
		super.textView.render();
		System.out.print("</u>");
		
	}

}
