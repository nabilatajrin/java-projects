package manageprogramflow;

public class loopingCodeBlocks {
    
    //array of Strings
    private static String[] months = 
    {"January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"};
    
    public static void main(String[] args){
        //1- for loop/ iteration loop
        System.out.println("For loop:");
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
        
        //2- for each loop
        System.out.println("\nFor each loop:");
        for (String month:
            months){
            System.out.println(month);
        }
        
        //3- while loop
        System.out.println("\nWhile loop:");
        int counter = 0;//need to declare before
        while(counter < months.length){
            System.out.println(months[counter]);
            counter++;
        }
        
        //4- do while loop
        System.out.println("\nDo while loop:");
        int counter2 = 0;
        do{
            System.out.println(months[counter]);
            counter++;
            
            if(counter == 5){
                break;
            }
        }while(counter < months.length);
    } 
}
