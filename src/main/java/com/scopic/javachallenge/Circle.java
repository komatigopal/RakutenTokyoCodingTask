// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public class Circle extends GeometricShape implements ShapeInterface {
	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		return PI * radius * radius;
	}

	@Override
	public float getPerimeter() {
		return 2 * PI * radius;
	}
}
