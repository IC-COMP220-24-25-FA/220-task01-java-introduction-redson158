package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int largest = first;
        if (first < 0){
            throw new IllegalArgumentException("Numbers can't be negative");
        }else{
            if (second < 0){
                throw new IllegalArgumentException("Numbers can't be negative");
            }else{
                if(second > largest){
                    largest = second;
                }
            }if (third < 0){
                throw new IllegalArgumentException("Numbers can't be negative");
            }else{
                if(third > largest){
                    largest = third;
                }
            }
        }
        return largest;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if(originalPrice <= 0){
            throw new IllegalArgumentException("Price must be positive");
        }else if(discountPercent < 0 || discountPercent > 100){
            throw new IllegalArgumentException("Discount cannot be negative");
        }else if(salesTax < 0){
            throw new IllegalArgumentException("Tax percent cannot be negative");
        }else{
            double discountedPrice = (originalPrice * (100 - discountPercent))/100;
            double finalPrice = (discountedPrice * (100 + salesTax))/100;
            return finalPrice;
        }
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        boolean isGood = true;
        if(yearsOld <= 5){
            if(daysSinceShoesChewed < 5 && fetchedThePaperToday == false){
                isGood = false;
            }
        }else{
            if(daysSinceShoesChewed < 10 || fetchedThePaperToday == false){
                isGood = false;
            }
        }
        return isGood;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if(numbers.size() == 0){
            return -1;
        }else{
            int largestIndex = 0;
            for(int i = 0; i < numbers.size(); i++){
                int num = numbers.get(i);
                if(num > numbers.get(largestIndex)){
                    largestIndex = i;
                }
            }
            return largestIndex;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
