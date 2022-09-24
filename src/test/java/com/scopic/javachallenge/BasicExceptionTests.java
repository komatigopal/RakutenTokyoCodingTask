package com.scopic.javachallenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicExceptionTests {
	String wrongParamCountExceptionMessage = "Wrong Param Count";
	String unsupportedShapeExceptionMessage = "Unsupported Shape";

	String createRectangle(float length, float width) {
		String message = new String();
		try {
			ShapeFactory.createShape("Rectangle", new float[] { length });
		} catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

	String createSquare(float side, float temp) {
		String message = new String();
		try {
			ShapeFactory.createShape("Square", new float[] { side, temp });
		} catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

	String createCircle(float radius, float temp) {
		String message = new String();
		try {
			ShapeFactory.createShape("Circle", new float[] { radius, temp });
		} catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

	String createTestObject(float radius) {
		String message = new String();
		try {
			ShapeFactory.createShape("test", new float[] { radius });
		} catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

	@Test
	void testShapeFactoryRectangleCreateObject() {
		String message = createRectangle(5, 6);
		assertEquals(wrongParamCountExceptionMessage, message);
	}

	@Test
	void testShapeFactorySquareCreateObject() {
		String message = createSquare(5, 6);
		assertEquals(wrongParamCountExceptionMessage, message);
	}

	@Test
	void testShapeFactoryCircleCreateObject() {
		String message = createCircle(5, 6);
		assertEquals(wrongParamCountExceptionMessage, message);
	}

	@Test
	void testShapeFactoryCreateTestObject() {
		String message = createTestObject(5);
		assertEquals(unsupportedShapeExceptionMessage, message);
	}
}
