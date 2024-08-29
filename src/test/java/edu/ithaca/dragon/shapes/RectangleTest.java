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

    }

    @Test
    public void testDoubleSize(){

    }

    @Test
    public void testLongestLineWithin(){

    }
}
