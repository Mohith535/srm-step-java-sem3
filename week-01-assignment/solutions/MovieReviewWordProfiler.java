public class MovieReviewWordProfiler {

    static void classifyWordLengths(String review) {

        // Trim first, then split on runs of whitespace so double
        // spaces do not produce empty "words"
        String cleaned = review.trim();

        if (cleaned.length() == 0) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        String[] words = cleaned.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords
                + " | Medium: " + mediumWords
                + " | Long: " + longWords);
    }

    public static void main(String[] args) {

        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
