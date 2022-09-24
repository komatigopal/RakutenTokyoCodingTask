// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

import com.scopic.javachallenge.exceptions.UnsupportedShapeException;
import com.scopic.javachallenge.exceptions.WrongParamCountException;

public class ShapeFactory {

	private ShapeFactory() {
		throw new IllegalStateException("Utility class");
	}

	public static GeometricShape createShape(String shape, float[] params)
			throws WrongParamCountException, UnsupportedShapeException {
		GeometricShape geometricShape = null;
		if (shape.equalsIgnoreCase(Circle.class.getSimpleName())) {
			if (params.length == 1) {
				geometricShape = new Circle(params[0]);
			} else {
				throw new WrongParamCountException("Wrong Param Count");
			}
		} else if (shape.equalsIgnoreCase(Square.class.getSimpleName())) {
			if (params.length == 1) {
				geometricShape = new Square(params[0]);
			} else {
				throw new WrongParamCountException("Wrong Param Count");
			}
		} else if (shape.equalsIgnoreCase(Rectangle.class.getSimpleName())) {
			if (params.length == 2) {
				geometricShape = new Rectangle(params[0], params[1]);
			} else {
				throw new WrongParamCountException("Wrong Param Count");
			}
		} else {
			throw new UnsupportedShapeException("Unsupported Shape");
		}
		return geometricShape;
	}

	// below method is also do same functionality but some much for generic purpose
	/*
	 * public static GeometricShape anotherApproachCreateShape(String shape, float[]
	 * params) throws Exception { GeometricShape geometricShape = null; if
	 * (shape.equalsIgnoreCase(Circle.class.getSimpleName())) { geometricShape =
	 * createGeometricShape(params, 1, Circle.class); } else if
	 * (shape.equalsIgnoreCase(Square.class.getSimpleName())) { geometricShape =
	 * createGeometricShape(params, 1, Square.class); } else if
	 * (shape.equalsIgnoreCase(Rectangle.class.getSimpleName())) { geometricShape =
	 * createGeometricShape(params, 2, Rectangle.class); } else { throw new
	 * UnsupportedShapeException("Unsupported Shape"); } return geometricShape; }
	 * 
	 * private static GeometricShape createGeometricShape(float[] params, int
	 * requiredParams, Class<?> className) throws Exception { GeometricShape
	 * geometricShape = null; if (params.length == requiredParams) { if
	 * (requiredParams == 1) { Constructor<?> constructor =
	 * className.getConstructor(float.class); geometricShape = (GeometricShape)
	 * constructor.newInstance(params[0]); } else { Constructor<?> constructor =
	 * className.getConstructor(float.class, float.class); geometricShape =
	 * (GeometricShape) constructor.newInstance(params[0], params[1]); } } else {
	 * throw new WrongParamCountException("Wrong Param Count"); } return
	 * geometricShape; }
	 */
}