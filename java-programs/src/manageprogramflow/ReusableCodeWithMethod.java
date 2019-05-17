/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageprogramflow;

import java.util.Scanner;

public class ReusableCodeWithMethod {
    
    //array of Strings
    private static String[] months = 
    {"January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"};
    
    public static void main(String[] args){ 
        loopMonths();
        loopMonths();
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter a month: ");
            String monthName = sc.nextLine();
            if(monthName.length() == 0){
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if(monthNumber == -1){
                System.out.println("month not found!");
            }else{
                System.out.println(String.format(
                        "%s is month number %d", monthName, monthNumber + 1));
            }
        }
    }
    
    private static void loopMonths(){
        System.out.println("\nFor loop:");
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
    }
    
    private static int getMonthNumber(String monthName){
        //System.out.println("\nFor loop:");
        for (int i = 0; i < months.length; i++){
            if(monthName.equalsIgnoreCase(months[i]))
                return i;
        }
        return -1;
    }
}
