/*
 * The sort() method allows us to sort our arrays. It takes in an array as the 
 * argument.
 */
package arraymethods;

import java.util.Arrays;
/**
 *
 * @author nabila
 */
public class SortMethod {
    public static void main(String[] args){
        int [] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        /*[-2, 1, 5, 12, 14, 16]*/
    } 
}
