package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.ArrayList;
import java.util.Arrays;

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
        assertTrue(FunctionPractice.isGoodDog(10, 10, true));
        assertFalse(FunctionPractice.isGoodDog(8, 9, true));
        assertFalse(FunctionPractice.isGoodDog(1, 0, false));
    }

    @Test
    public void testFindFirstLargest(){
        ArrayList<Integer> list1 = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findFirstLargest(list1));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 2));
        assertEquals(3, FunctionPractice.findFirstLargest(list2));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 3));
        assertEquals(0, FunctionPractice.findFirstLargest(list3));

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(-3, -8, -4, -2));
        assertEquals(3, FunctionPractice.findFirstLargest(list4));
    }

    @Test
    public void testFindLastLargest(){
        ArrayList<Integer> list1 = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findLastLargest(list1));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 2));
        assertEquals(3, FunctionPractice.findLastLargest(list2));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 3));
        assertEquals(3, FunctionPractice.findLastLargest(list3));

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(-3, -8, -4, -2));
        assertEquals(3, FunctionPractice.findLastLargest(list4));
    }

    @Test
    public void testFindFirstMostOccurencesOfLetter(){
        ArrayList<String> list1 = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(list1, 'a'));

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("happy", "guppy", "pops", "hello"));
        assertEquals("happy", FunctionPractice.findFirstMostOccurencesOfLetter(list2, 'p'));

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("hello", "world", "python", "java"));
        assertEquals("", FunctionPractice.findFirstMostOccurencesOfLetter(list3, 'z'));

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("tap", "jazz", "hiphop", "ballet", "modern"));
        assertEquals("ballet", FunctionPractice.findFirstMostOccurencesOfLetter(list4, 'l'));
    }
    
}
