/*Carson Jacobs
 * 10/16/18
 */
import java.util.Scanner;

public class Ex33{
    public static void main(String[] args){
    	//Declare variables
        Scanner in = new Scanner(System.in);
        
        //Prompt the user
        System.out.print("Enter a, b, c, d, e, f: ");
   
        
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        //Check that Denominator is not 0
        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y id %.1f", x, y);
        }

    }
}
