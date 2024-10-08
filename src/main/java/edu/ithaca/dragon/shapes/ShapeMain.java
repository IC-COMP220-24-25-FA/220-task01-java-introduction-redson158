package edu.ithaca.dragon.shapes;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Random random = new Random();
        List<Shape> shapes = new ArrayList<Shape>();
        for(int i = 0; i < 10; i++){
            int shapeType = random.nextInt(3);
            if(shapeType == 0){
                shapes.add(new Circle(random.nextDouble() * 10));
            }else if(shapeType == 1){
                shapes.add(new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10));
            }else{
                shapes.add(new Triangle(random.nextDouble() * 10, random.nextDouble() * 10));
            }  
        }
        for(Shape shape : shapes){
            System.out.println(shape.toString());
        }
        for(Shape shape : shapes){
            shape.doubleSize();
            System.out.println(shape.toString());
        }
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Rectangle> rectList = new ArrayList<>();
         for (int i = 0; i < 5; i++) {
            rectList.add(new Rectangle(rand.nextDouble() * 10, rand.nextDouble() * 10));
        }

        for (int i = 0; i < rectList.size(); i++) {
            Rectangle rectangle = rectList.get(i);
            System.out.println("Rectangle " + (i + 1) + ":");
            System.out.println("Area: " + rectangle.calcArea());
            System.out.println("Longest Line Within: " + rectangle.longestLineWithin());
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("Choose a rectangle (1-5): ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5) {
                rectList.get(choice - 1).doubleSize();
            }

            System.out.println("Updated Rectangles:");
            for (Rectangle rectangle : rectList) {
                System.out.println("Area: " + rectangle.calcArea());
                System.out.println("Longest Line Within: " + rectangle.longestLineWithin());
            }
        }

        scanner.close();
    }
}

    


