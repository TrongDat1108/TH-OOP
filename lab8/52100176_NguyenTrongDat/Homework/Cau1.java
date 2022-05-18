import java.util.Vector;

public class Cau1 {
    public static Vector<Integer> f(Vector<Integer> x) {
        Vector<Integer> fx = new Vector<Integer>();
        for (int i = 0; i < x.size(); i++) {
            fx.add(x.get(i) * x.get(i) + 1);
        }
        return fx;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(6);
        vector.add(5);
        vector.add(4);
        vector.add(3);
        vector.add(2);
        vector.add(1);
        Vector<Integer> fx = f(vector);
        for (int i = 0; i < fx.size(); i++) {
            System.out.println(fx.get(i) + " ");
        }
    }
}
