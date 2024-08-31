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

    }

    @Test
    public void testDoubleSize(){

    }

    @Test
    public void testLongestLineWithin(){

    }
}
