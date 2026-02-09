/*Taking 2 Input from User And Print Int Anbd String */

import java.util.*;
public class MultipalInput {
   public static void main(String[] args) {
    Scanner fr = new Scanner(System.in);
    int age;
    String Name;

    System.out.println("Enter Your Age");
    age= fr.nextInt();
    fr.nextLine();

    System.out.println("Enter Your Name");
    Name=fr.nextLine();

    System.out.println("Your Age Is :" + age);
    System.out.println("Your Name Is :" + Name);
    fr.close();
   } 
}
