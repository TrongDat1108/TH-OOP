import java.util.Scanner;

public class Cau10 {
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

    public static int findMax(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void delete(int a[], int n) {
        int i = 0;
        for (int j = i = 0; i < a.length; i++) {
            if (a[i] != n) {
                a[j] = a[i];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        inputArray(a, n);
        outputArray(a, n);

        int temp = 0;
        n = a.length;
        for (int i = 0; i < n; i++) {
            int index = findMax(a);
            delete(a, index);
            temp++;
            n--;
            if (temp == 3) {
                System.out.println("The third largest element in an array = " + index);
            }
        }
        input.close();
    }
}
