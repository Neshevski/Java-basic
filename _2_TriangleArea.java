import java.util.Scanner;

/**
 * Created by Rosen on 3/18/2016.
 */
public class _2_TriangleArea {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the coordinate A(x;y)");
        int ax=input.nextInt();
        int ay=input.nextInt();
        System.out.println("Enter the coordinate B(x;y)");
        int bx=input.nextInt();
        int by=input.nextInt();
        System.out.println("Enter the coordinate C(x;y)");
        int cx=input.nextInt();
        int cy=input.nextInt();
        int area=0;
        if ( ax==ay||bx==by||cx==cy  ){
            System.out.println(0);

        }
        else {

           area= (ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
        }

            System.out.println("Result : " + Math.abs(area ));
    }
}
