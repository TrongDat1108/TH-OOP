public class Cau2 {
    public static String shortName(String str) {
        // int first = str.indexOf(" ");
        // int last = str.lastIndexOf(" ");
        // String firstName = str.substring(0, first);
        // String lastName = str.substring(last);

        // return lastName + " " + firstName;
        String[] word = str.split(" ");
        return word[word.length - 1].concat(" " + word[0]);

    }

    public static String hashtagName(String str) {
        // int first = str.indexOf(" ");
        // int last = str.lastIndexOf(" ");
        // String firstName = str.substring(0, first);
        // String lastName = str.substring(last);

        // return "#" + lastName.trim() + firstName;
        String[] word = str.split(" ");
        return "#" + word[word.length - 1].concat(word[0]);
    }

    public static String upperCaseAllVowel(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            if (newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u') {
                result += (char) (newChar - 32);
                continue;
            }
            result += newChar;
        }
        return result;
    }

    public static String upperCaseAllN(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            if (newChar == 'n') {
                result += (char) (newChar - 32);
                continue;
            }
            result += newChar;
        }
        return result;
    }

    public static void main(String[] args) {
        String n = "Nguyen Le Trong Tin";
        System.out.println(shortName(n).trim());
        System.out.println(hashtagName(n));
        System.out.println(upperCaseAllVowel(n));
        System.out.println(upperCaseAllN(n));
    }
}
