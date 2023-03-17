import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
 public void anagram () {

         Scanner in = new Scanner(System.in);

         System.out.print("Enter first string: ");
         String s = in.nextLine().toUpperCase();


         System.out.print("Enter second string: ");
         String t = in.nextLine().toUpperCase();
         char[] arraySs = s.toCharArray();
         char[] arraySt = t.toCharArray();
         Arrays.sort(arraySs);
         Arrays.sort(arraySt);
         if (Arrays.equals(arraySs, arraySt)) {
             System.out.println("Anagram.");
         } else {
             System.out.println("No anagram.");
         }
     }


 }

