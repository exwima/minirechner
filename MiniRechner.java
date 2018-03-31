package zweiZahlen;

import java.util.Scanner;

public class MiniRechner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zwei Zahlen einlesen
        System.out.println("Hallo. Bitte geben Sie Zahl a ein.");
        int a = scanner.nextInt();
        System.out.println("Bitte geben Sie Zahl b ein.");
        int b = scanner.nextInt();

        // Kontrollausgabe
        System.out.println("Zahl a ist: " + a);
        System.out.println("Zahl b ist: " + b);

        // Berechnen
        boolean weiter = true;
        while (weiter) {

            // Funktion wählen
            System.out.println(
                    "Bitte wählen Sie eine Funktion: (a) = addieren, (m) = multiplizieren");
            char f = scanner.next().charAt(0);

            // Funktion ausführen
            if (f == 'a') {
                int erg = a + b;
                System.out
                        .println("Summe a+b: " + a + " + " + b + " = " + erg);
            } else if (f == 'm') {
                int erg = a * b;
                System.out
                        .println("Summe a*b: " + a + " * " + b + " = " + erg);
            }

            else {
                System.out.println("Operation nicht verfügbar.");
            }

        }

        // fertig
        System.out.println("Tschüss.");
        scanner.close();

    }

}
