import java.util.ArrayList;

public class Test {

    public static boolean checkDistance(Point points, double distance) {
        double result = Math.sqrt(points.getX() * points.getX() + points.getY() * points.getY());
        if (result <= distance) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();

        double distance = 1.0;
        points.add(new Point(1, 0));
        points.add(new Point(5, 2));
        points.add(new Point(5, 6));
        points.add(new Point(1, 8));
        points.add(new Point(9, 17));
        points.add(new Point(12, 2));

        for (Point temp : points) {
            if (checkDistance(temp, distance)) {
                System.out.println(temp + " is in the circle");
            } else {
                System.out.println(temp + " is not in the circle");
            }
        }
    }
}