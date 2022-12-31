import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class ScannerDemo {

    public static void main(String[] args) {

        int ganzzahl=0;
        double kommazahl=0.0;
        String wort="";
        boolean wahrheitswert=false;
        char buchstabe=' ';

        Scanner uchikomi = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        ganzzahl = uchikomi.nextInt();
        System.out.print("Sie haben " + ganzzahl + " eingegeben!\n\n");

        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");
        kommazahl = uchikomi.nextDouble();
        System.out.print("Sie haben " + kommazahl + " eingegeben!\n\n");

        System.out.print("Bitte geben Sie ein Wort ein : ");
        wort = uchikomi.next();
        System.out.print("Sie haben '" + wort + "' eingegeben!\n\n");

        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
        wahrheitswert = uchikomi.nextBoolean();
        System.out.print("Sie haben '" + wahrheitswert + "' eingegeben!\n\n");

        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
        buchstabe = uchikomi.next().charAt(0);
        System.out.print("Sie haben '" + buchstabe + "' eingegeben!\n");
       
        uchikomi.close();
    }
}