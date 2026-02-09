// Number positive/negative check karo.

import java.util.*;
public class CheakPositiveNegative {
   public static void main(String[] args) {
     Scanner Cheak = new Scanner(System.in);
        int num1;
       
        System.out.println("Enter Number to Cheak Positive Or Negative");

        System.out.println("Enter any number");
        num1=Cheak.nextInt();

         

        if (num1>0) {
            System.out.println("Number is the Positive \n");
        }
        else{
            System.out.println("Number is Negative ");
        }
   } 
}
