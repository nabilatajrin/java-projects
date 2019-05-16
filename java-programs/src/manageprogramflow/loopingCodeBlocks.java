package manageprogramflow;

public class loopingCodeBlocks {
    
    //array of Strings
    private static String[] months = 
    {"January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"};
    
    public static void main(String[] args){
        //for loop
        System.out.println("For loop:");
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
        
        //for each loop
        System.out.println("\nFor each loop:");
        for (String month:
            months){
            System.out.println(month);
        }
        
        //while loop
        System.out.println("\nWhile loop:");
        int counter = 0;//need to declare before
        while(counter < months.length){
            System.out.println(months[counter]);
            counter++;
        }
    } 
}
