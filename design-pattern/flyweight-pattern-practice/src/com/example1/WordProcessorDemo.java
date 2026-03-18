package com.example1;

public class WordProcessorDemo {

	public static void main(String[] args) {
        FontStyleFactory factory = new FontStyleFactory();
        FontStyle arial12 = factory.getFontStyle("Arial", 12, false, false);
        FontStyle arial12Bold = factory.getFontStyle("Arial", 12, true, false);
        FontStyle arial12Again = factory.getFontStyle("Arial", 12, false, false);
        
        arial12.format(1, 1, 'H');
        arial12Bold.format(1, 2, 'e');
        arial12Again.format(1, 3, 'l');
        
        System.out.println("Same instance? " + (arial12 == arial12Again));
        System.out.println("Total styles: " + factory.getStyleCount());

	}

}
