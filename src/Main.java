import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = -1;

        //Only excepts positive Integers, if not the loop continues.
        while (input < 0) {
            try {
                System.out.println("Bitte geben sie die Anzahl (als Integer) der auszugebenden Fibonacci Zahlen ein:" +
                        "\n (Negative Integer werden nicht akzeptiert)");

                input = scanner.nextInt();

            } catch (InputMismatchException ex) {
                System.err.println("Nur Integer werden akzeptiert, versuchen sie es erneut");
                scanner.next();
            }
        }
        switch (input) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(0 + "\n" + 1);
                break;
            default:
                FibonacciCounter.printFibonacci(input - 2);
                break;
        }
        System.out.println("Fertig!");
        scanner.close();
    }
}
