package variables;

import java.math.BigDecimal;

public class BigDecimalProgram {

    public BigDecimalProgram(int par) {
    }
    public static void main(String[] args){
        double value = .012;
        System.out.println("value = " + value);
        
        double pSum = value + value + value;
        System.out.println("\npSum = " + pSum);
        
        String strValue = Double.toString(value);
        strValue = "0.012";
        
        BigDecimal bigValue = new BigDecimal(strValue);
        System.out.println("bigValue = " + bigValue);
        
       
    }

  
}
