public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0) {
            System.out.println("No readings in the log");
            return;
        }

        // Best streak seen so far
        char longestColour = signalLog.charAt(0);
        int longestLength = 1;

        // Streak currently being counted
        char currentColour = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            char ch = signalLog.charAt(i);

            if (ch == currentColour) {
                currentLength++;
            } else {
                // Streak broken, start counting a new one
                currentColour = ch;
                currentLength = 1;
            }

            // Check after every character so the final streak is not missed
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestColour = currentColour;
            }
        }

        System.out.println("Longest Streak: '" + longestColour
                + "' repeated " + longestLength + " times");
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }
}
