/*
 * The copyOfRange() method allows you to copy the contents of one array into 
 * another. It requires three arguments.
 */
package arraymethods;

import java.util.Arrays;
/**
 *
 * @author nabila
 */
public class CopyOfRangeMethod {
    
    public static void main(String[] args){
        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source, 3, 7);
        
        System.out.println(Arrays.toString(dest));
        /*[-2, 16, 14, 18]*/
    }
}
