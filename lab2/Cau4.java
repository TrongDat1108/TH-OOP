import java.util.Scanner;

public class Cau4 {
    public static void inputArray(int[] a, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value of the element %d: ", i);
            a[i] = input.nextInt();
        }
    }

    public static void outputArray(int[] a, int n) {
        System.out.print("The value of the array: ");
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public static int countNumbers(int[] a, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        int n, k;

        System.out.print("Enter the number of elements for the array: ");
        n = input.nextInt();
        inputArray(a, n);
        outputArray(a, n);
        System.out.print("Enter the number of array to find: ");
        k = input.nextInt();

        System.out.println("The number of specific element in an array is: " + countNumbers(a, n, k));

        input.close();

    }
}
