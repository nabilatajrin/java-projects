package variables;

public class mathOperators {
    public static void main(String[] args){
        int intValue1 = 56;
        int intValue2 = 42;
        
        int result1 = intValue1 + intValue2;
        System.out.println("result1 = " + result1);
        
        int result2 = intValue1 - intValue2;
        System.out.println("result2 = " + result2);
        
        int result3 = intValue1 * intValue2;
        System.out.println("result3 = " + result3);
        
        int result4 = intValue1 / intValue2;
        System.out.println("result4 = " + result4);
        
        double result5 = (double)intValue1 / (double)intValue2;
        System.out.println("result5 = " + result5);
        
        long rounded = Math.round(result5);
        System.out.println("rounded = " + rounded);
        
        int neg = -5;
        System.out.println("neg = " + neg);
        double absValue = Math.abs(neg);
        System.out.println("absValue = " + absValue);
    }
}
