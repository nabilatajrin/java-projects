/*
 * Note that in the example above, we added parenthesis to the mathematical 
 * expression 50+2. This is to force the compiler to evaluate the expression 
 * first before concatenating the result with the other two substrings. You are 
 * strongly advised to do so whenever you concatenate strings with mathematical
 * expressions. Failure to do so can result in errors.
 */
package interactiveprograms;

/**
 *
 * @author nabila
 */
public class Concatenation {
    public static void main(String[] args){
        System.out.println("The sum of 50 and 2 is " + (50 + 2) + ".");
        System.out.println("The sum of 50 and 2 is " + 50 + 2 + ".");
        /*The sum of 50 and 2 is 52.*/
        /*The sum of 50 and 2 is 502.*/
    }
}
