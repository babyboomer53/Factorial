import java.util.function.UnaryOperator;
import java.util.Scanner;

/**
 * This  program  implements a recursive function which returns a number that is
 * the the product of an integer, and all of the integers preceding it. In other
 * words,  it returns the Factorial of an integer. For example, the factorial of
 * 3 (commonly specified as 3!  and  pronounced,  "three  factorial")  would  be
 * 3×2×1, or 6.
 * 
 * This  program  accepts  an integer from the user, and computes its factorial.
 * The acceptable input is confined to integers from 1 through 10.
 * 
 * This program computes the factorial of the integer twice (once with  a  class
 * method and again with a lambda function) and reports both results.
 */

/**
 *
 * @author Edgar Cole
 */

public class Factorial {
    // A recursive function which returns the factorial of an integer 
    int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    // A lambda expression implementing the same recursive function as the one
    // above
    UnaryOperator<Integer> fac = x -> x == 0 ? 1 : x * this.fac.apply(x - 1);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        Factorial F = new Factorial();

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println(number + "! is " + F.factorial(number));
        System.out.println(number + "! is " + F.fac.apply(number));
    }

}
