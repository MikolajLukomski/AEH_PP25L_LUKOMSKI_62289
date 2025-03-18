package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public mojaDrugaAplikacja() {
    }

    public static void main(String[] args) {

        double x = (double)10.0F;
        double y = (double)5.0F;

        Scanner scanner = new Scanner(System.in);

        double result = x + y;

        System.out.println("x + y = " + result);
        result = x - y;

        System.out.println("x - y = " + result);
        result = x * y;

        System.out.println("x * y = " + result);
        result = x / y;

        System.out.println("x / y = " + result);
        result = x % y;

        System.out.println("x % y = " + result);
        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));
    }
}
