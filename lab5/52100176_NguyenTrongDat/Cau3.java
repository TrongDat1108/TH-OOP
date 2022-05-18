public class Cau3 {
    public static int countWord(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }
        String[] words = paragraph.split("\\s+");
        return words.length;
    }

    public static int countSentences(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }
        String[] sentences = paragraph.split("\\.|\\?|\\!|\\:\\...");
        return sentences.length;
    }

    public static int countAppear(String paragraph, String word) {
        int count = 0;
        String temp = paragraph.toLowerCase();
        String temp1 = word.toLowerCase();

        String[] index = temp.split("\\s+|\\.|\\,");
        for (String check : index) {
            if (check.equals(temp1)) {
                count++;
            }
        }
        return count++;
    }

    public static void main(String[] args) {
        String a = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";

        System.out.println(countWord(a));
        System.out.println(countSentences(a));
        System.out.println(countAppear(a, "a"));
    }
}
