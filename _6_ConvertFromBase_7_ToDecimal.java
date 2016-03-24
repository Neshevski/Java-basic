import java.util.Scanner;

/**
 * Created by Rosen on 3/21/2016.
 */
public class _6_ConvertFromBase_7_ToDecimal {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter number : ");

        String baseSeven=userInput.next();
        Integer decimal=Integer.valueOf(baseSeven,7);
        System.out.println("In decimal system the number is: "+decimal);
    }
}
