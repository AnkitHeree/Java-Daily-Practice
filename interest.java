import java .util.*;
public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rupya jitna tumne diya tha");
        double Rupee = sc.nextDouble();

        System.out.println("Kitne  interest par o btaoo");
        double vyaj = sc.nextDouble();

         System.out.println("Kitne years ho Gaye");
        double Year = sc.nextDouble();

        double SI = (Rupee * vyaj * Year) / 100;

        System.out.println("Are o Munna de do Re itna Rupeya :" + SI);
        sc.close();
    }
}
