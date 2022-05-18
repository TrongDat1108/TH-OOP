import java.util.Scanner;
import java.math.BigDecimal;

public class Cau8 {
    public static void inputArray(BigDecimal arr[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the value of the element %d: ", i);
            arr[i] = input.nextBigDecimal();
        }
    }

    public static void outputArray(BigDecimal arr[], int n) {
        System.out.print("The value of the array: ");
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static BigDecimal findMax(BigDecimal arr[], int n) {
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            result = arr[0].max(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements for the array: ");
        int n = input.nextInt();

        BigDecimal[] array = new BigDecimal[n];

        inputArray(array, n);
        outputArray(array, n);

        System.out.println("The maximum value of an BigDecimal object array: " + findMax(array, n));
        input.close();
    }
}
