import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private static final Pattern PATTERN = Pattern.compile(
            "^(\\s*)([1-9]|10)(\\s*)([+\\-*/])(\\s*)([1-9]|10)(\\s*)$");

    public static void main(String[] args) {
        new Calculator().calculate();    }

    private void calculate() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        checkInputString(str);

        str = str.replaceAll("(\\s*)", "");
        String[] strArr = str.split("[+-/*]");

        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        String operation = str.substring(
                strArr[0].length(),
                str.length() - strArr[1].length());
        int res = calculate(a, operation, b);
        System.out.println(res);    }

    private void checkInputString(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.matches())
            throw new UnsupportedOperationException("Illegal operations: " + str);    }

    private int calculate(int a, String operation, int b) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Operation is not valid");        }
    }
}
