import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rosen on 3/22/2016.
 */
public class _8_OddAndEvenPairs {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String userInput=scan.nextLine();
            String[] stringNumbers=userInput.split(" ");
            int[] numbers = new int[stringNumbers.length];
            int[] pair = new int[2];
            int count = 0;
            if((stringNumbers.length%2) !=0){
                System.out.println("Invalid length");


            }
            else{
                for(int i =0 ; i<stringNumbers.length;i++){
                    numbers[i]=Integer.parseInt(stringNumbers[i]);

                }
                for(int i= 0 ; i < stringNumbers.length;i++){
                    count++;
                    if(count==2){
                        if((numbers[i]%2==0)&&(numbers[i-1]%2==0)){
                            System.out.printf("%d, %d -> Both even",numbers[i-1],numbers[i]);
                            System.out.println();
                            count=0;

                        }else if((numbers[i]%2 != 0)&&(numbers[i-1]%2!=0)){
                            System.out.printf("%d, %d  -> Both are odd", numbers[i-1],numbers[i]);
                            System.out.println();
                            count=0;

                        }else{
                            System.out.printf("%d, %d -> Different", numbers[i - 1], numbers[i]);
                            System.out.println();
                            count = 0;
                        }
                    }
                }
            }

        }

    }



//You are given an array of integers as a single line, separated by a space.
// Write a program that checks consecutive pairs and prints if both are odd/even or not.
// Note that the array length should also be an even numberYou are given an array of integers as a single line, separated by a space.
