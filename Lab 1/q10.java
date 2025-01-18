import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();
        float floatValue = (float) intValue;
        System.out.println("Int to Float: " + floatValue);

        System.out.print("Enter a float value: ");
        floatValue = sc.nextFloat();
        int intFromFloat = (int) floatValue;
        System.out.println("Float to Int: " + intFromFloat);

        System.out.print("Enter an integer to convert to String: ");
        int intToString = sc.nextInt();
        String stringFromInt = Integer.toString(intToString);
        System.out.println("Int to String: " + stringFromInt);
    }
}
