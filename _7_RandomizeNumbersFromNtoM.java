import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rosen on 3/21/2016.
 */
public class _7_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number n ");
        int n = userInput.nextInt();
        System.out.println("Enter number m ");
        int m = userInput.nextInt();

        int startNumber=Math.min(m,n);
        int endNumber=Math.max(m,n);
        ArrayList<Integer>nums=new ArrayList<Integer>();

        for (int i = startNumber; i <=endNumber ; i++) {
            nums.add(i);

        }
        Collections.shuffle(nums);
        System.out.print(nums.toString());
    }
}
