import java.util.Scanner;

public class Cau5 {
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

    public static int countPrimeNumber(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0 || a[i] == 1) {
                continue;
            } else {
                for (int j = 2; j < (a[i] / 2); j++) {
                    if (a[i] % j != 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();

        inputArray(a, n);
        outputArray(a, n);

        System.out.println("Total of the prime number in a array: " + countPrimeNumber(a, n));

        input.close();
    }
}
