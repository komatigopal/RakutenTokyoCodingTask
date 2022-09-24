// /////////////////////////////////////////////////////////////////////////////
// WORKING AREA
// THIS IS AN AREA WHERE YOU SHOULD WRITE YOUR CODE AND MAKE CHANGES
// /////////////////////////////////////////////////////////////////////////////

package com.scopic.javachallenge;

public class Square extends GeometricShape implements ShapeInterface {
	private float side;

	public Square(float side) {
		this.side = side;
	}

	@Override
	public float getPerimeter() {
		return 4 * side;
	}

	@Override
	public float getArea() {
		return side * side;
	}

}