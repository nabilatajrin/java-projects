package arraymethods;

import java.util.Arrays;
/**
 *
 * @author nabila
 */
public class EqualsMethod {
    public static void main(String[] args){
        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};
        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);  

        System.out.println(result1); // true
        System.out.println(result2); // false
    }
}