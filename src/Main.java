import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {   String s = "Input:";
            System.out.println(s);    }
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        String str = sc.nextLine();

        int a = sc.nextInt();
        System.out.print("(+,-,*,/)");
        char marina = sc.next().charAt(0);
        System.out.print(" ");
        int b = sc.nextInt();
        if (marina == '+') {
            int result = a + b;
            System.out.println(+result);        }
        if (marina == '-') {
            int result = a - b;
            System.out.println(+result);        }
        if (marina == '*') {
            int result = a * b;
            System.out.println(+result);        }
        if (marina == '/') {
            int result = a / b;
            System.out.println(+result);
        } else {
            System.out.println("throws Exception");
        }
    }
}






