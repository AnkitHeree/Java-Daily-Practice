import java.util.*;
public class AreaofCircle {

    public static void main(String[] args) {
        double radius;
        double area;

        Scanner red =new Scanner(System.in);

        System.out.println("Enter Radious :");
        radius = red.nextDouble();

        area = 3.14*radius*radius;
        System.out.println("The Area of Circle is : "+ area);
        red.close();

    }
}