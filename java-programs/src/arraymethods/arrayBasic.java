package arraymethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayBasic {
    public static void main(String[] args){
        //31,45,22,98,10
        
        //allocate seperately
        int[] numbers = new int[5];
        
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;
        
        //sort numbers, this method is mutating the numbers of the array
        Arrays.sort(numbers);
        System.out.println("sorted numbers: " + numbers); //[I@15db9742 is memory address
        System.out.println("sorted numbers: " + Arrays.toString(numbers));
        
        //declaring, initializing, allocating in one line of code
        int[] numbers2 = {31, 45, 22, 98, 10};
        
        String[] myFavoriteCandyBars = {"twix", "Hersey's", "Crunch"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        
        //replace
        myFavoriteCandyBars[2] = "Butterfingers";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        
        //get the length of the array, most used
        System.out.println("Length: " + myFavoriteCandyBars.length);

        //array class
        System.out.println("Print: " + Array.get(myFavoriteCandyBars, 2));
        
    }
}
