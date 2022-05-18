import java.util.Scanner;

public class Cau9 {
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

    public static int[] divisibleNumbers(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }
        if (count == 0) {
            return arr;
        }
        int[] temp = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        inputArray(arr, n);
        outputArray(arr, n);

        System.out.print("Enter k: ");
        int k = input.nextInt();

        arr = divisibleNumbers(arr, k);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ",");
        }
        System.out.print("]");
        input.close();
    }

}
