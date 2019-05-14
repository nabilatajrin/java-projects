package stringmethods;

import java.util.Scanner;

public class StringBuilderTest2 {
    
    public static void main(String[] args){
        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value 1:");
        String input1 = scanner.nextLine();
        
        
        System.out.println("Enter value 2:");
        String input2 = scanner.nextLine();
        
        b.append(input1)
                .append(", ")
                .append(input2);
        
        System.out.println(b.toString());
    }
}
