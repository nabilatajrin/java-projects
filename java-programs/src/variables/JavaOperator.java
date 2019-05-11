package variables;

public class JavaOperator {
    public static void main(String[] args){
        int intValue = 10;
        
        System.out.println("Postfix: " + intValue++);
        System.out.println("Prefix: " + ++intValue);
        
        //alt
        intValue = 10;
        System.out.println("\nPostfix: " + intValue++);
        
        intValue = 10;
        System.out.println("Prefix: " + ++intValue);
    }
}
