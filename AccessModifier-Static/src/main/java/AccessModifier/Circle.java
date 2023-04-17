package AccessModifier;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle(){}

     public Circle(double r){
        this.radius = r ;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

}
