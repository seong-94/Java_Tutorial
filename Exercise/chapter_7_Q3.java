package Exercise;

public class chapter_7_Q3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                arr[evenCount] = i;
                evenCount++;
            } else {
                arr2[oddCount] = i;
                oddCount++;
            }

        }

    }
}