package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if(length >= 1){
            if(width >= 1){
                this.length = length;
                this.width = width;
            }else{
                throw new IllegalArgumentException("Width must be positive");
            }
        }else{
            throw new IllegalArgumentException("Length must be positive");
        }
    }

    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
