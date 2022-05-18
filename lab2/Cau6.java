import java.util.Scanner;

public class Cau6 {

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

    public static int find(int arr[], int k) {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == k) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.print("Enter n: ");
        int n = input.nextInt();

        inputArray(a, n);
        outputArray(a, n);

        System.out.print("Enter k: ");
        int k = input.nextInt();

        System.out.println("Index position of 5 is: " + find(a, k));

        System.out.println("Index position of 7 is: " + find(a, k));

        input.close();
    }
}
