package com.scopic.javachallenge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class BasicTests {
    DecimalFormat df = new DecimalFormat("0.00");

    Circle CreateCircle(float radius) {
        try {
            return (Circle) ShapeFactory.createShape("Circle", new float[] { radius });
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    void testCircleCreateObject() {

        Circle circle = new Circle(4);

        assertThat(circle, instanceOf(Circle.class));
    }

    @Test
    void testCircleName() {

        Circle circle = new Circle(4);

        assertThat(circle, instanceOf(Circle.class));
        assertEquals("Circle", circle.getName());
    }

    @Test
    void testCircleArea() {
        Circle circle = new Circle(4);
        assertThat(circle, instanceOf(Circle.class));

        assertEquals(df.format(50.24), df.format(circle.getArea()));
    }

    @Test
    void testCirclePerimiter() {
        Circle circle = new Circle(4);
        assertThat(circle, instanceOf(Circle.class));
        assertEquals(df.format(25.12), df.format(circle.getPerimeter()));
    }

    @Test
    void testShapeFactoryCircleCreateObject() {
        Circle circle = CreateCircle(4);
        assertThat(circle, instanceOf(Circle.class));
    }
}
