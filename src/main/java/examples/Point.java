package examples;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
//    getters/setters


    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x: " + x + "\ny: " + y;
    }

    public static void main(String[] args) {
        Point point = new Point(5, 3);
        System.out.println(point);

        Point another = new Point(0, 0);
        System.out.println(another);

    }
}
