package manageprogramflow;

/*
 * The if and else keywords give you complete flexibility in writing conditional 
 * code. But, you can sometimes write conditional code more efficiently using 
 * the switch statement. A switch statement examines a single value, and then 
 * compares it to multiple possibilities.
 * and open the template in the editor.
 */
 
public class SwitchCase {
    
    public static void main(String[] args){    
        int month = 4;
        switch(month){
            case 0:
                System.out.println("It's January");
                break;
            case 1:
                System.out.println("It's February");
                break;
            case 2:
                System.out.println("It's March");
                break;
            default:
                System.out.println("Some other month!");     
        }     
        
        //example 2
        int month2 = 1;
        switch(month2){
            case 0:
            case 1:
            case 2:
                System.out.println("It's a quarter 1!");
                break;
            default:
                System.out.println("Some other month2!");     
        } 
        
        //example3
        String monthName = "Jan";
        switch(monthName){
            case "January":
                System.out.println("It's the first month!");
                break;
            default:
                System.out.println("It isn't January!");
        }
    }
}
