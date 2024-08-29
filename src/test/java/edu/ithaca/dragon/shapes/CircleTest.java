package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    public void testLongestLineWithin(){
        Circle circle1 = new Circle(1);
        assertEquals(2, circle1.longestLineWithin(), 0.0001);

        Circle circle2 = new Circle(5.5);
        assertEquals(11, circle2.longestLineWithin(), 0.0001);

        Circle circle3 = new Circle(0.1);
        assertEquals(0.2, circle3.longestLineWithin(), 0.00001);
    }

    @Test
    public void testDoubleSize(){
        Circle circle1 = new Circle(1);
        Circle expected1 = new Circle(2);
        circle1.doubleSize();
        assertEquals(expected1.getRadius(), circle1.getRadius(), 0.0001);

        Circle circle2 = new Circle(5.5);
        Circle expected2 = new Circle(11);
        circle2.doubleSize();
        assertEquals(expected2.getRadius(), circle2.getRadius(), 0.0001);

        Circle circle3 = new Circle(0.5);
        Circle expected3 = new Circle(1);
        circle3.doubleSize();
        assertEquals(expected3.getRadius(), circle3.getRadius(), 0.00001);
    }


    
}
