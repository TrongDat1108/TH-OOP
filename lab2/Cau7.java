import java.util.Scanner;

public class Cau7 {
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

    public static void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
            System.out.println("All elements after the square: " + arr[i]);

            if (arr[i] == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();

        inputArray(a, n);
        outputArray(a, n);

        square(a);

        input.close();
    }
}
