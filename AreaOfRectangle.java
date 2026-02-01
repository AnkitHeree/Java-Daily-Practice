import java.util.*;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int Area;
        int Length;
        int Breadth;

        Scanner ar = new Scanner(System.in);
        System.out.println("Enter The Length of Rectangle:");
        Length = ar.nextInt();

        System.out.println("Enter The Breadth of Rectangle :");
        Breadth = ar.nextInt();

        Area = Length * Breadth;
        System.out.println("The Area Of Rectangle is : " + Area + " " + "Meter Square");
        ar.close();
    }
}