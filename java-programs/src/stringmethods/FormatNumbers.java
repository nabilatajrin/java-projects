package stringmethods;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
    
    public static void main(String[] args){
        
        double doubleValue = 123_456_78.89;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));
        
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));
        
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));
        
        Locale locale = new Locale("de","DE");
        NumberFormat localFormat = NumberFormat.getIntegerInstance(locale);
        System.out.println(localFormat.format(doubleValue));
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));
        
        NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat2.format(doubleValue));
        
        DecimalFormat df = new DecimalFormat("$000.00");
        System.out.println(df.format(1));
        System.out.println(df.format(5.891));
        
        DecimalFormat df2 = new DecimalFormat("$##0.00#");
        System.out.println(df2.format(1));
        System.out.println(df2.format(5.891));  
    }
}
