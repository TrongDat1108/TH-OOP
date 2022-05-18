import java.util.*;

public class Cau1 {
    // cau a
    public static int maxEven(int[] a) {
        int max = a[0];

        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
        }
        return max;
    }

    // cau b
    public static int minOdd(int[] a) {
        int min = a[0];
        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        return min;
    }

    // cau c
    public static int sumMEMO(int[] a) {
        int sum = 0;
        sum = maxEven(a) + minOdd(a);
        return sum;
    }

    // cau d
    public static int sumEven(int[] a) {
        int sum = 0;
        if (a.length == 0) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    // cau e
    public static int prodOdd(int[] a) {
        int product = 1;

        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                product *= a[i];
            }
        }
        return product;
    }

    // cau f
    public static int idxFirstEven(int[] a) {
        int index = 0;

        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                index = i;
            }
        }
        return index;
    }

    // cau g
    public static int idxLastOdd(int[] a) {
        int index = 0;

        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                index = i;
            }
        }
        return index;
    }

    // cau h
    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 2, 4, 1, 7, 8, 3, 1, 0, 5, 9 };
        System.out.println(maxEven(a));
        System.out.println(minOdd(a));
        System.out.println(sumMEMO(a));
        System.out.println(sumEven(a));
        System.out.println(prodOdd(a));
        System.out.println(idxFirstEven(a));
        System.out.println(idxLastOdd(a));

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] temp = input(n);
        System.out.print("[ ");
        for (int check : temp) {
            System.out.print(check + " ");
        }
        System.out.print("]");
        sc.close();
    }
}