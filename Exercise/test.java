package Exercise;

public class test {

    public static void main(String[] args)

    {

        // 1~20사이의 짝수만 배열에 담아 출력
        int[] evenNumber = new int[10];
        int[] oddNumber = new int[10];

        int evenCnt = 0;
        int oddCnt = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumber[evenCnt] = i;
                evenCnt++;
            } else {
                oddNumber[oddCnt] = i;
                oddCnt++;
            }
        }
        System.out.print("홀수: ");
       // for (int n : oddNumber) {
           // System.out.print(n + "  ");
       // }
        System.out.println();
        System.out.print("짝수: ");
        for (int n : evenNumber) {
            System.out.print(n + "  ");
        }
    }
}
