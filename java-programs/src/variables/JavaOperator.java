package variables;

public class JavaOperator {
    public static void main(String[] args){
        //postfix and prefix 
        int intValue = 10;
        
        System.out.println("Postfix: " + intValue++);
        System.out.println("Prefix: " + ++intValue);
        
        //alt
        intValue = 10;
        System.out.println("\nPostfix: " + intValue++);
        
        intValue = 10;
        System.out.println("Prefix: " + ++intValue);
        
        //equality operator
        if(intValue == ++intValue){
            System.out.println("They match");
        }else{
            System.out.println("They don't match");
        }
    }
}
