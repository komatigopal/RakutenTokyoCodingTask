package com.scopic.javachallenge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

public class BasicRectangleTests {
	DecimalFormat df = new DecimalFormat("0.00");

	Rectangle createRectangle(float length, float width) {
		try {
			return (Rectangle) ShapeFactory.createShape("Rectangle", new float[] { length, width });
		} catch (Exception e) {
			return null;
		}
	}

	@Test
	void testRectangleCreateObject() {
		Rectangle rectangle = new Rectangle(4, 6);
		assertThat(rectangle, instanceOf(Rectangle.class));
	}

	@Test
	void testRectangleName() {
		Rectangle rectangle = new Rectangle(4, 6);
		assertThat(rectangle, instanceOf(Rectangle.class));
		assertEquals("Rectangle", rectangle.getName());
	}

	@Test
	void testRectangleArea() {
		Rectangle rectangle = new Rectangle(4, 6);
		assertThat(rectangle, instanceOf(Rectangle.class));
		assertEquals(df.format(24.00), df.format(rectangle.getArea()));
	}

	@Test
	void testRectanglePerimiter() {
		Rectangle rectangle = new Rectangle(4, 6);
		assertThat(rectangle, instanceOf(Rectangle.class));
		assertEquals(df.format(20.00), df.format(rectangle.getPerimeter()));
	}

	@Test
	void testShapeFactoryRectangleCreateObject() {
		Rectangle rectangle = createRectangle(4, 6);
		assertThat(rectangle, instanceOf(Rectangle.class));
	}
}
