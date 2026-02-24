package com.examples.impl;

import com.examples.interfaces.TextDecorator;
import com.examples.interfaces.TextView;

public class BoldDecorator extends TextDecorator{

	public BoldDecorator(TextView textView) {
		super(textView);
	}

	@Override
	public void render() {
		System.out.print("<b>");
		super.textView.render();
		System.out.print("</b>");
		
	}

}
