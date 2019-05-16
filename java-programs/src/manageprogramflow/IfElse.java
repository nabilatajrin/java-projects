package manageprogramflow;

public class IfElse {
    public static void main(String[] args){
        int monthNumber = 4;
        
        //simple conditional expression
        if (monthNumber == 0) {
            System.out.println("It's January");
        }else{
            System.out.println("It isn't January");
        }
        
        //cpmpound conditional expression
        if (monthNumber >= 0 && monthNumber <= 2) {
            System.out.println("You are in quarter 1");
        }else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("You are in quarter 2");
        }else{
            System.out.println("It's the 2nd half of the year");
        }
    }
}
