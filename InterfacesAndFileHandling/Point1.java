import java.lang.Math;

public class Point1 implements Order
{
    private double x, y;

    public Point1(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean lessThan(Order other) {
        Point1 p = (Point1) other;
        if (x == p.getX())
            return (y < p.getY());
        else
            return (x < p.getX());
    }

    //This code is the modified version to use the distance
    //from the origin as the distance from point i.e closest 
    //to origin will be taken as correct.
    //
    //public boolean lessThan(Order other) {
    //Point p = (Point) other;
    //double distA = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    //double distB = Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2));
    //return distA < distB;
    //}
}
