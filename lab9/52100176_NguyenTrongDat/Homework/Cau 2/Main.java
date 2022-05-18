import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        try {
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String[] lines = input.nextLine().split(" ");
                for (String line : lines) {
                    sum += Integer.parseInt(line);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            FileWriter file = new FileWriter("output.txt");
            file.write(Integer.toString(sum));
            file.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
