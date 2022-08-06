import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        System.out.println("Hello and welcome. This is a simple calculator. It has four functions:");

        System.out.println("");

        System.out.println("1. multiply");
        System.out.println("2. divide");
        System.out.println("3. add");
        System.out.println("4. subtract");

        System.out.println("");

        System.out.println("What function would you like to use? Please type in the number of the function (1 - 4):");

        Scanner scanFunction = new Scanner(System.in);
        int n = scanFunction.nextInt();

        System.out.println("Please enter the first number of your sum:");

        Scanner scanInteger = new Scanner(System.in);
        int a = scanInteger.nextInt();

        System.out.println("Please enter the second number of your sum:");

        Scanner scanInteger2 = new Scanner(System.in);
        int b = scanInteger2.nextInt();

        System.out.println("The answer of your sum is:");

        if (n == 1) {
            multiply(a, b);
        } else if (n == 2) {
            divide(a, b);
        } else if (n == 3) {
            add(a, b);
        } else if (n == 4) {
            subtract(a, b);
        }

    }


    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

}
