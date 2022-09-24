// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public class Rectangle extends GeometricShape implements ShapeInterface {
	private float length;
	private float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public float getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public float getArea() {
		return width * length;
	}

}