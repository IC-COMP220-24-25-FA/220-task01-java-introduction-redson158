package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if(radius < 1){
            throw new IllegalArgumentException("Radius Must be Positive");
        }else{
            this.radius = radius;  
        }
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter = this.radius * 2;
        return diameter;
    }

    public double getRadius(){
        return this.radius;
    }
}
