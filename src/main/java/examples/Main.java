package examples;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 3);
        System.out.println(point);

        point.setX(0);
        System.out.println(point);

        Point another = new Point(0, 0);
        System.out.println(another);

    }
}
