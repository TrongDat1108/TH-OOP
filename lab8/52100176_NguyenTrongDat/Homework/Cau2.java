import java.util.HashMap;
import java.util.Scanner;

public class Cau2 {
    public static boolean check(HashMap<String, String> dict, String key) {
        if (dict.containsKey(key)) {
            return true;
        }
        return false;
    }

    public static String getValue(HashMap<String, String> dict, String input) {
        return dict.get(input);
    }

    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("car", "xe hoi");
        dict.put("cat", "meo");
        dict.put("bird", "chim");
        dict.put("fish", "ca");
        dict.put("horse", "ngua");
        dict.put("house", "nha");
        dict.put("pig", "heo");
        dict.put("door", "cai cua");
        dict.put("chicken", "ga");
        dict.put("computer", "may tinh");
        System.out.print("Nhap tu can tim nghia: ");
        String input = new Scanner(System.in).nextLine();
        if (check(dict, input)) {
            System.out.println("Tu " + input + " co nghia la: " + getValue(dict, input));
        } else {
            System.out.println("Tu " + input + " khong ton tai trong tu dien");
        }
    }
}