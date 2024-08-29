package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testRectangleConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2, 4));

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(3, 0));
    }

    @Test
    public void testCalcArea(){
        Rectangle rectangle1 = new Rectangle(3, 4);
        assertEquals(12, rectangle1.calcArea(), 0.0001);

        Rectangle rectangle2 = new Rectangle(1, 1);
        assertEquals(1, rectangle2.calcArea(), 0.0001);

        Rectangle rectangle3 = new Rectangle(0.5, 0.4);
        assertEquals(0.2, rectangle3.calcArea(), 0.0001);
    }

    @Test
    public void testDoubleSize(){
        Rectangle rectangle1 = new Rectangle(3, 4);
        rectangle1.doubleSize();
        double area1 = rectangle1.calcArea();
        assertEquals(24, area1, 0.0001);

        Rectangle rectangle2 = new Rectangle(1, 1);
        rectangle2.doubleSize();
        double area2 = rectangle2.calcArea();
        assertEquals(2, area2, 0.0001);

        Rectangle rectangle3 = new Rectangle(0.5, 0.4);
        rectangle3.doubleSize();
        double area3 = rectangle3.calcArea();
        assertEquals(0.4, area3, 0.0001);
    }

    @Test
    public void testLongestLineWithin(){

    }
}
