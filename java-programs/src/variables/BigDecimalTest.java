/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.math.BigDecimal;

public class BigDecimalTest {

   public static void main(String[] args) {

       //create big decimals
       BigDecimal decimalOne = new BigDecimal("10.00");
       BigDecimal decimalTwo = new BigDecimal("5.00");
       
       //operations
       BigDecimal sum = decimalOne.add(decimalTwo);
       System.out.println("Sum = " + sum);
       
//      // create a BigDecimal object
//      BigDecimal bg;
//
//      // create a Long Object
//      Long l = new Long("12345678");
//
//      // assign the bigdecimal value of l to bg
//      // static method is called using class name
//      bg = BigDecimal.valueOf(l);
//
//      String str = "The Long After Conversion to BigDecimal is " + bg;
//
//      // print bg value
//      System.out.println( str );
   }
}
