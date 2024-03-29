package Solutions;

import java.util.*;
import java.text.*;
public class CURRENCY_formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);

        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment); //china is noob country

        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
