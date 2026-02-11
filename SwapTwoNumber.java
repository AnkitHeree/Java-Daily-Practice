import java.util.*;
public class SwapTwoNumber {
    public static void main(String args[]){
        Scanner positive = new Scanner(System.in);
        int num1;
        int num2;
        int temp;
        System.out.println("Enter number 1 ");
        num1 = positive.nextInt();

         System.out.println("Enter number 2 ");
        num2 = positive.nextInt();

        temp=num1;
        num1=num2;
        num2=temp;

       System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        positive.close();

    }
}
