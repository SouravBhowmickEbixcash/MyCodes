package com.example.client;

import java.util.ArrayList;
import java.util.List;

import com.example.registry.BundledShapeCache;
import com.example.shapes.Shape;

public class PrototypeClient {

	public static void main(String[] args) {
		
		BundledShapeCache registry = new BundledShapeCache();
		Shape circlePrototype = registry.getPrototype("Big Green Circle");
		Shape rectanglePrototype = registry.getPrototype("Big Blue Rectangle");
		
		Shape circleObj1 = circlePrototype.cloneObject();
		Shape rectangleObj1 = rectanglePrototype.cloneObject();
		
		List<Shape> prototypes = new ArrayList<>();
		prototypes.add(circlePrototype);
		prototypes.add(rectanglePrototype);
		
		List<Shape> shapesCopy = new ArrayList<>();
		shapesCopy.add(circleObj1);
		shapesCopy.add(rectangleObj1);
		
        for (int i = 0; i < prototypes.size(); i++) {
            if (prototypes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (prototypes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }

	}

}
