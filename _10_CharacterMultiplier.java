import java.util.Scanner;

/**
 * Created by Rosen on 3/23/2016.
 */
public class _10_CharacterMultiplier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        System.out.println(multiplier(array[0], array[1]));

    }
    public static int multiplier(String firstString, String secondString) {
        int count = firstString.length();
        boolean theSameLength = true;
        int sum = 0;
        if (firstString.length() != secondString.length()) {
            theSameLength = false;
            count = Math.min(firstString.length(), secondString.length());

        }
        for (int i = 0; i < count; i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);

        }
        if (!theSameLength && count == firstString.length()) {

            for (int i = count; i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        } else if (!theSameLength) {
            for (int i = count; i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
            }
            return sum;
        }
    }

