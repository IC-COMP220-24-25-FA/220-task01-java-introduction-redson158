package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        if(base > 0){
            if(height > 0){
                this.base = base;
                this.height = height;
            }else{
                throw new IllegalArgumentException("Height must be > 0");
            }
        }else{
            throw new IllegalArgumentException("Base Must be > 0");
        }
    }

    public double calcArea(){
        return 0;
    }

    public void doubleSize(){
        throw new RuntimeException("Method not implemented");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Method not implemented");
    }
}
