package Chapter4;

import java.text.NumberFormat.Style;

public class Quest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int answer;

        char operator = '+';

        if (operator == '+') {
            answer = num1 + num2;
        } else if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '/') {
            answer = num1 / num2;
        } else if (operator == '*') {
            answer = num1 * num2;
        } else {
            answer = 0;
        }

        System.out.println(answer);

        int num3 = 10;
        int num4 = 2;

        switch (operator) {
            case '+':
                System.out.println(num3 + num4);
                break;
            case '-':
                System.out.println(num3 - num4);
                break;
            case '*':
                System.out.println(num3 * num4);
                break;
            case '/':
                System.out.println(num3 / num4);
                break;
            default:
        }

        int lineCount = 4;
        int starCount = 1;
        int spaceCount = lineCount / 2 + 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount -= 1;
            starCount += 2;
            System.out.println();
        }
    }
}
