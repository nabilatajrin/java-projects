/*
 * The binarySearch() method allows you to search for a specific value in a 
 * sorted array. To use this method, make sure your array is sorted first. You 
 * can use the sort() method mentioned above to do so.
 */
package arraymethods;

import java.util.Arrays;
/**
 *
 * @author nabila
 */
public class BinarySearchMethod {
    public static void main(String[] args){
       int[] myInt = {21, 23, 34, 45, 56, 78, 99};
       //To determine if 78 is inside the array, we write
        int foundIndex = Arrays.binarySearch(myInt, 78);
        int foundIndex2 = Arrays.binarySearch(myInt, 39);
        System.out.println(foundIndex);
        System.out.println(foundIndex2);
        /*5*/
        /*-4*/
    }  
}
