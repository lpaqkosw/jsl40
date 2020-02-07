package app.f;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x){
        this.x = x;
    }

    public Point(){}

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
}