import java.util.*;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner largest = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter Two Number ");

        System.out.println("Enter Number 1");
        num1=largest.nextInt();

         System.out.println("Enter Number 2");
        num2=largest.nextInt();

        System.out.println("Enter Number 3");
        num3=largest.nextInt();

        if (num1>num2) {
            System.out.println("Number 1 is The Gratest Number \n");
        }
        else if(num2>num3)
        {
            System.out.println("Number Two is The Largest number");
        }
        else{
            System.out.println("Number The is The Largest Number bro");
        }
        
        largest.close();
    }
}
    
