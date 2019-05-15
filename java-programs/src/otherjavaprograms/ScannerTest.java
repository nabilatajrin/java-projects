package otherjavaprograms;

import java.awt.*;
import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("write something");
        String userInput = sc.next();
        
        String uppercased = userInput.toUpperCase();
        System.out.println(uppercased);
        
        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);
        
        System.out.println("Contains: " + userInput.contains("Enter"));
        System.out.println("Contains: " + userInput.contains("nter"));
        
        System.out.println("Type a number: ");
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);
    }
}
