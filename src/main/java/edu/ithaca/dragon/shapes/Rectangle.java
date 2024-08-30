package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if(length >= 0){
            if(width >= 0){
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
       double area = this.length * this.width;
       return area;
    }

    public void doubleSize(){
        this.length *= 2;
    }

    public double longestLineWithin(){
        double diagonalSquared = Math.pow(this.length, 2) + Math.pow(this.width, 2);
        double diagonal = Math.sqrt(diagonalSquared);
        return diagonal;
    }
    
}
