import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data = "";
        try {
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                data += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        data = data.toUpperCase();
        try {
            FileWriter newfile = new FileWriter("output.txt");
            newfile.write(data);
            newfile.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
