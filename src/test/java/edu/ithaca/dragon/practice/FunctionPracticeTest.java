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
        double price1 = FunctionPractice.calcSalePrice(100, 50, 8);
        assertEquals(54, price1, 0.0001);

        double price2 = FunctionPractice.calcSalePrice(20, 0, 8);
        assertEquals(21.6, price2, 0.0001);

        double price3 = FunctionPractice.calcSalePrice(100, 99, 8);
        assertEquals(1.08, price3, 0.0001);

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-50, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(5, 150, 2));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(50, 0, -3));
    }

    @Test
    public void testGoodDog(){
        assertTrue(FunctionPractice.isGoodDog(4, 38, true));
        assertFalse(FunctionPractice.isGoodDog(3, 0, false));
        assertTrue(FunctionPractice.isGoodDog(10, 10, false));
        assertFalse(FunctionPractice.isGoodDog(1, 0, true));
    }
    
}
