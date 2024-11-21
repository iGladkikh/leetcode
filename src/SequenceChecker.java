public class SequenceChecker {
    public static void main(String[] args) {
        System.out.println(checkSequence(new int[]{1, 2, 3, 4, 5}));
        System.out.println(checkSequence(new int[]{-5, 0, 3, 4, 5}));
        System.out.println(checkSequence(new int[]{5, 4, 3, 2, 1}));
        System.out.println(checkSequence(new int[]{5}));
        System.out.println(checkSequence(new int[]{5, 1}));

        System.out.println(checkSequence(new int[]{5, 4, 5}));
        System.out.println(checkSequence(new int[]{5, 5, 5}));
        System.out.println(checkSequence(new int[]{5, 5, 4}));
        System.out.println(checkSequence(new int[]{5, 4, 4}));
    }

    static boolean checkSequence(int[] sequence) {
        if (sequence.length < 3) {
            return true;
        }

        if (sequence[0] == sequence[1]) {
            return false;
        }

        boolean isAsc = sequence[0] < sequence[1];
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i] <= sequence[i + 1] != isAsc) {
                return false;
            }
        }
        return true;
    }
}
