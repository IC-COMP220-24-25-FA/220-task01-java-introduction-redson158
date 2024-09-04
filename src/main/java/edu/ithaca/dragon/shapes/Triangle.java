package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        if(baseIn > 0){
            if(heightIn > 0){
                base = baseIn;
                height = heightIn;
            }else{
                throw new IllegalArgumentException("Height must be > 0");
            }
        }else{
            throw new IllegalArgumentException("Base Must be > 0");
        }
    }

    public double calcArea(){
        double area = 0.5 * base * height;
        return area;
    }

    public void doubleSize(){
        base *= 2;
        height *= 2;
    }

    public double longestLineWithin(){
        double hypSqrd = Math.pow(base, 2) + Math.pow(height, 2);
        double hyp = Math.sqrt(hypSqrd);
        return hyp;
    }

    public String toString(){
        return "Triangle; Base = " + base + ", Height = " + height;
    }
}
