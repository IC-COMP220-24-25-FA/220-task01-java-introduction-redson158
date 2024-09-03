package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        //middle is largest//
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        //first is largest//
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        //last is largest//
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        //all are equal//
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        //test error for negatives//
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        fail("Not implemented yet");
    }
    
}
