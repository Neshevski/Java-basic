import java.util.Scanner;
import java.lang.Math;
public class _4_ClculateExpression {
    public static void main(String[] args) {
        Scanner usersInput= new Scanner(System.in);
        System.out.println("Enter number a ");
        double a = usersInput.nextDouble();
        System.out.println("Enter number b ");
        double b = usersInput.nextDouble();
        System.out.println("Enter number c ");
        double c = usersInput.nextDouble();

        double sqrtC = Math.sqrt(c);
        double baseOne=((a*a+b*b)/(a*a-b*b));
        double powerOne= (a+b+c)/sqrtC;
        double formulaOne= Math.pow(baseOne,powerOne);

        double baseTwo=(a*a+b*b-c*c*c);
        double powerTwo=(a-b);
        double formulaTwo=Math.pow(baseTwo,powerTwo);

        double formulaTree= ((a+b+c)/3)-((formulaOne+formulaTwo)/2);

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",formulaOne,formulaTwo,Math.abs(formulaTree));





    }
}
