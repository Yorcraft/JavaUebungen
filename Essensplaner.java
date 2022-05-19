import java.util.Scanner;
import java.util.Random;

public class Essensplaner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Essensplan für Eine Woche oder Ein Tag?");
        String Bestellung = scan.nextLine();

        String[] Gerichte = { "Spaghetti m. Pesto", "Kartoffeln m. Quark", "Schupfnudeln", "Rouladen", "Gyros",
                "Mercimeck m. Baguette" };
        Random random = new Random();
        int x = random.nextInt(5);

        switch (Bestellung) {
        case "Ein Tag":
            System.out.println(Gerichte[x]);
            break;
        case "Eine Woche":
            int x2 = random.nextInt(5);
            int x3 = random.nextInt(5);
            int x4 = random.nextInt(5);
            int x5 = random.nextInt(5);
            int x6 = random.nextInt(5);
            int x7 = random.nextInt(5);

            System.out.println("Montag: " + Gerichte[x] + " \nDienstag: " + Gerichte[x2] + "\nMittwoch: " + Gerichte[x3]
                    + "\nDonnerstag: " + Gerichte[x4] + "\nFreitag: " + Gerichte[x5] + "\nSamstag: " + Gerichte[x6]
                    + "\nSonntag: " + Gerichte[x7] + "\n \n \n");

            if (x == x2 || x2 == x3 || x3 == x4 || x4 == x5 || x5 == x6 || x6 == x7) {
                System.out.println(
                        "Hoppla ein gericht kommt dopellt vor.\n Möchten Sie ein einzelnes neues Gericht oder einen neuen Plan");
                System.out.println("Geben Sie Gericht oder Plan ein: ");
                String auswahl = scan.nextLine();
                while (x == x2 || x2 == x3 || x3 == x4 || x4 == x5 || x5 == x6 || x6 == x7) {
                    if (auswahl.contains("Gericht")) {
                        if (x == x2) {
                            x = random.nextInt(5);
                        } else if (x2 == x3) {
                            x2 = random.nextInt(5);
                            ;
                        } else if (x3 == x4) {
                            x3 = random.nextInt(5);
                        } else if (x4 == x5) {
                            x4 = random.nextInt(5);
                            ;
                        } else if (x5 == x6) {
                            x5 = random.nextInt(5);
                            ;
                        } else if (x6 == x7) {
                            x6 = random.nextInt(5);
                            ;
                        }
                    }
                }

                System.out.println("Montag: " + Gerichte[x] + " \nDienstag: " + Gerichte[x2] + "\nMittwoch: "
                        + Gerichte[x3] + "\nDonnerstag: " + Gerichte[x4] + "\nFreitag: " + Gerichte[x5] + "\nSamstag: "
                        + Gerichte[x6] + "\nSonntag: " + Gerichte[x7] + "\n \n \n");

                if (auswahl.contains("Plan")) {
                    while (x == x2 || x2 == x3 || x3 == x4 || x4 == x5 || x5 == x6 || x6 == x7) {
                    x2 = random.nextInt(5);
                    x3 = random.nextInt(5);
                    x4 = random.nextInt(5);
                    x5 = random.nextInt(5);
                    x6 = random.nextInt(5);
                    x7 = random.nextInt(5);
                    }

                    System.out.println("Montag: " + Gerichte[x] + " \nDienstag: " + Gerichte[x2] + "\nMittwoch: "
                            + Gerichte[x3] + "\nDonnerstag: " + Gerichte[x4] + "\nFreitag: " + Gerichte[x5]
                            + "\nSamstag: " + Gerichte[x6] + "\nSonntag: " + Gerichte[x7] + "\n \n \n");
                }
            }
            break;

        }
        scan.close();
    }
}
