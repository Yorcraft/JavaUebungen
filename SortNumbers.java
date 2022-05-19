

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Zahl 1  ");
       int zahl1 = scanner.nextInt();
       scanner.nextLine();
            System.out.println("Zahl 2  ");
            int zahl2 = scanner.nextInt();
            scanner.nextLine();
                System.out.println("Zahl 3  ");
                int zahl3 = scanner.nextInt();
                scanner.nextLine();
            System.out.println("Zahl 4  ");
            int zahl4 = scanner.nextInt();
            scanner.nextLine();
       System.out.println("Zahl 5  ");
       int zahl5 = scanner.nextInt();
       scanner.nextLine();
      
        int[] Zahlen = {zahl1, zahl2, zahl3, zahl4, zahl5};




    Arrays. sort (Zahlen);
    for(int i=0; i<=Zahlen.length-1; i++){
        System.out.println(Zahlen [i]);
    }
      }
    }


  
