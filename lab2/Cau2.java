import java.util.Scanner;

public class Cau2 {
    public static void inputArray(int[] a, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value of the element %d: ", i);
            a[i] = input.nextInt();
        }
        input.close();
    }

    public static void outputArray(int[] a, int n) {
        System.out.print("The value of the array: ");
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public static int findMin(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();

        inputArray(a, n);
        outputArray(a, n);

        System.out.println("The minimum value of the array is: " + findMin(a, n));

        input.close();
    }
}
