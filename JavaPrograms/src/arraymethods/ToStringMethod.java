/*
 * The toString() method returns a String that represents the contents of an 
 * array. This makes it easy for us to display the contents of the array.
 */
package arraymethods;

import java.util.Arrays;
/**
 *
 * @author nabila
 */
public class ToStringMethod {
    
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        /*[1, 2, 3, 4, 5]*/
    }
}
