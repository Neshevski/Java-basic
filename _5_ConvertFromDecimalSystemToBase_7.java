import java.util.Scanner;

/**
 * Created by Rosen on 3/21/2016.
 */
public class _5_ConvertFromDecimalSystemToBase_7 {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter number : ");
        int decimal = userInput.nextInt();
        String baseSeven=Integer.toString(decimal,7);
        System.out.println("In base-7 system the number is: "+baseSeven);
    }
}
