package variables;

import java.math.BigDecimal;

public class BigDecimalProgram {

    public static void main(String[] args){
        double value = .012;
        System.out.println("value = " + value);
        
        double pSum = value + value + value;
        System.out.println("pSum = " + pSum);
        
        String strValue = Double.toString(value);
        strValue = "0.012";
        
        BigDecimal bigValue = new BigDecimal(strValue);
        System.out.println("\nbigValue = " + bigValue);
        
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("bSum = " + bSum);
        
        Double sum = bSum.doubleValue();
        System.out.println("sum = " + sum);  
    }
}
