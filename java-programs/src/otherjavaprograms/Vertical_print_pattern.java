package otherjavaprograms;

import java.util.Scanner;

public class Vertical_print_pattern{  
    
    public static void main(String[]args){        
        //Body starts
        Scanner s = new Scanner(System.in);       
        String st = s.nextLine();
        for(int i = 0; i<st.length(); i++){
            System.out.println(st.charAt(i));
        } //Body ends
    }   
}

/*
######
Input:
Dhaka

######
Output:
D
h
a
k
a
BUILD SUCCESSFUL (total time: 16 seconds)
*/
