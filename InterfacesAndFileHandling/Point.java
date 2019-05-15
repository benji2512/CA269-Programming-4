public class Point{

    private double x;
    private double y;

    public Point(double newX, double newY){
        x = newX;
        y = newY;
    }             
    public Point midPoint(Point pt){
        double midx = (x + pt.x) / 2;
        double midy = (y + pt.y) / 2;
        return new Point(midx,midy);
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
