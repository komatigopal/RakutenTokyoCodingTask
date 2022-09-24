package com.scopic.javachallenge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

public class BasicSquareTests {
	DecimalFormat df = new DecimalFormat("0.00");

	Square createSquare(float side) {
		try {
			return (Square) ShapeFactory.createShape("Square", new float[] { side });
		} catch (Exception e) {
			return null;
		}
	}

	@Test
	void testSquareCreateObject() {
		Square square = new Square(4);
		assertThat(square, instanceOf(Square.class));
	}

	@Test
	void testSquareName() {
		Square square = new Square(4);
		assertThat(square, instanceOf(Square.class));
		assertEquals("Square", square.getName());
	}

	@Test
	void testSquareArea() {
		Square square = new Square(5);
		assertThat(square, instanceOf(Square.class));
		assertEquals(df.format(25.00), df.format(square.getArea()));
	}

	@Test
	void testSquarePerimiter() {
		Square square = new Square(5);
		assertThat(square, instanceOf(Square.class));
		assertEquals(df.format(20.00), df.format(square.getPerimeter()));
	}

	@Test
	void testShapeFactorySquareCreateObject() {
		Square square = createSquare(4);
		assertThat(square, instanceOf(Square.class));
	}
}
