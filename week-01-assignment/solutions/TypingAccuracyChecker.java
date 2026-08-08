public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {

        // The comparison only makes sense position by position
        if (original.length() != typed.length()) {
            System.out.println("Invalid input: both texts must be the same length");
            return;
        }

        int total = original.length();
        int matched = 0;

        // Position of the first mismatch, 1-based; -1 means none found yet
        int firstMismatch = -1;

        for (int i = 0; i < total; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i + 1;
            }
        }

        // Cast to double so the division does not truncate to 0
        double accuracy = (double) matched / total * 100;

        String result = "Matched: " + matched + "/" + total
                + " | Accuracy: " + String.format("%.2f", accuracy) + "%";

        if (firstMismatch == -1) {
            result = result + " | No Mismatches";
        } else {
            char expected = original.charAt(firstMismatch - 1);
            char actual = typed.charAt(firstMismatch - 1);

            result = result + " | First Mismatch at position " + firstMismatch
                    + " ('" + expected + "' vs '" + actual + "')";
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
