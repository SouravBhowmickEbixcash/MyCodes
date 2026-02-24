package com.examples;

import com.examples.impl.BoldDecorator;
import com.examples.impl.ItalicDecorator;
import com.examples.impl.PlainTextView;
import com.examples.impl.UnderlineDecorator;
import com.examples.interfaces.TextView;

public class ClientTest {

	public static void main(String[] args) {
		
		TextView plainText = new PlainTextView("Hello Sourav");
		
		TextView boldText = new BoldDecorator(plainText);
		
		TextView boldItalicView = new ItalicDecorator(boldText);
		
		TextView boldItalicUnderlineView = new UnderlineDecorator(boldItalicView);
		
		boldItalicUnderlineView.render();

	}

}
