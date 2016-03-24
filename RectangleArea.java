import java.util.Scanner;

/**
 * Created by Rosen on 3/18/2016.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter site a : ");
        int a= input.nextInt();
        System.out.println("Enter site b : ");
        int b = input.nextInt();
        int area= a*b;
System.out.println("The rectangle's area is:  "+area );
    }
}
