/*Sum of Two Numbe Input Taken By User */

import java.util.*;

public class InputAndSum {
   public static void main(String[] args) {
    int num1;
    int num2;
    float sum;
    Scanner rf = new Scanner(System.in);
    System.out.println("Enter Your Number 1:");
    num1 = rf.nextInt();
    System.out.println("Enter Your Number 2:");
    num2 = rf.nextInt();

    sum=num1+num2;

    System.out.println("The Sum of That Two Number is" + sum);
   } 
}
