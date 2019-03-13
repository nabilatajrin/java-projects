/*
 * The split() method splits a string into substrings based on a user-defined 
 * separator (also known as a delimiter). After splitting the string, the 
 * split() method returns an array that contains the resultingsubstrings. An 
 *array is a collection of related data. We’ll discuss arrays in the next 
 *section.
 */
package stringmethods;

import java.util.Arrays;

/**
 *
 * @author nabila
 */
public class SplitMethod {
    public static void main(String[] args){
        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
        System.out.println(Arrays.toString(splitNames));
        /*[Peter, John, Andy, David]*/
        /*should be --> {"Peter", "John", "Andy", "David"--not clear*/
    }
    
}
