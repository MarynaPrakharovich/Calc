import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.trim();
        check(str);

        String[] strArr = str.split("[+-/*]");
        strArr[0] = strArr[0].trim();
        strArr[1] = strArr[1].trim();

        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);

        String operation = str.substring(
                strArr[0].length(),
                str.length() - strArr[1].length());
        operation = operation.trim();
        System.out.println(calculate(a, operation, b));
    }


    private static Pattern pattern = Pattern.compile("(([1-9]|10){1})([+\\-*/]{1})(([1-9]|10){1})");

    private static void check(String str) throws IllegalArgumentException {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches())
            throw new IllegalArgumentException("Illegal operations: " + str);
    }

    private static int calculate(int a, String operation, int b) {
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
                throw new IllegalArgumentException("Operation is not valid");
        }
    }
}