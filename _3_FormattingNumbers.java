import java.util.Scanner;

/**
 * Created by Rosen on 3/18/2016.
 */
public class _3_FormattingNumbers {

    public static void main(String[] args) {
        Scanner usersInput = new Scanner(System.in);
        System.out.println("Enter number a in the range (0 ≤ a ≤ 500)");
        int a = usersInput.nextInt();
        String binaryA= Integer.toBinaryString(a);
        System.out.println("Enter number b ");
        double  b = usersInput.nextDouble();
        System.out.println("Enter number c ");
        double c= usersInput.nextDouble();
        System.out.printf("|"+"%1$-10X"+"|" +"%2$010d"+"|"+"%3$10.2f"+"|"+"%4$-10.3f",a,Integer.parseInt(binaryA),b,c );


    }
    }

