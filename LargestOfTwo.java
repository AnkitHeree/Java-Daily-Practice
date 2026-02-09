import java.util.*;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner largest = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter Two Number ");

        System.out.println("Enter Number 1");
        num1=largest.nextInt();

         System.out.println("Enter Number 2");
        num2=largest.nextInt();

        if (num1>num2) {
            System.out.println("Number 1 is The Gratest Number \n");
        }
        else{
            System.out.println("Number Two is The Largest number");
        }
        largest.close();
    }
    
}
