package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testTriangleConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-2, 4));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 0));
    }

    @Test
    public void testCalcArea(){
        Triangle tri1 = new Triangle(3, 3);
        double area1 = tri1.calcArea();
        assertEquals(4.5, area1, 0.0001);

        Triangle tri2 = new Triangle(5, 4);
        double area2 = tri2.calcArea();
        assertEquals(10, area2, 0.0001);

        Triangle tri3 = new Triangle(0.5, 0.4);
        double area3 = tri3.calcArea();
        assertEquals(0.1, area3, 0.00001);
    }

    @Test
    public void testDoubleSize(){

    }

    @Test
    public void testLongestLineWithin(){

    }
}
