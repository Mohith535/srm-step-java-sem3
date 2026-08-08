public class ExamHallSeatChecker {

    static void checkDuplicateSeats(int[] seatNumbers) {

        boolean foundAny = false;

        for (int i = 0; i < seatNumbers.length; i++) {

            // Skip this seat if the same number already appeared earlier,
            // otherwise a seat repeated three times would be reported twice
            boolean alreadyReported = false;

            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyReported = true;
                    break;
                }
            }

            if (alreadyReported) {
                continue;
            }

            // Compare against every seat after this one
            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundAny = true;
                    break;
                }
            }
        }

        if (!foundAny) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
        checkDuplicateSeats(new int[]{101, 102, 103, 104, 105});
    }
}
