public class berrechnung {
    public static void main(String[] args) {
        long erg = 2;
        int x = 5;
        long y = 1;
        while (x > 0) {

            long z = erg;
            while (z > 0) {
                y = y * 2;
                z = z - 1;
            }
            x = x - 1;
            erg = y;

        }
        System.out.println("End: " + erg);
    }
}
