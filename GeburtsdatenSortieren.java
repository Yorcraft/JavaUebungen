
import java.util.Arrays;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Sotierung {

      public static void main(String[] args)throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Geben Sie das erste Alter an dd-MM-yyyy");
        String alter1 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Geben Sie das nächste Alter an dd-MM-yyyy");
        String alter2 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Geben Sie das nächste Alter an dd-MM-yyyy");
        String alter3 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Geben Sie das nächste Alter an dd-MM-yyyy");
        String alter4 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Geben Sie das nächste Alter an dd-MM-yyyy");
        String alter5 = scanner.nextLine();
        
        Date alterf1 = sdf.parse(alter1);
        Date alterf2 = sdf.parse(alter2);
        Date alterf3 = sdf.parse(alter3);
        Date alterf4 = sdf.parse(alter4);
        Date alterf5 = sdf.parse(alter5);
       
      
        Date[] Geburtsdaten = {alterf1, alterf2, alterf3, alterf4, alterf5};
        Arrays.sort (Geburtsdaten);
        for(int i=0; i<=Geburtsdaten.length-1; i++){
            System.out.println(Geburtsdaten [i]);



        }
      }
    }

