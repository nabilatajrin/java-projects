package variables;

public class convertingValues {
    public static void main(String[] args){
        short sh = 100;
        int i = sh;
        System.out.println("i = " + i);
        
       // short sh2 = i; //incompatible types, it's lossy conversion, i may lose data by doing this.
        
       short sh2 = (short)i;
       System.out.println("sh2 = " + sh2);
       
       short sh3 = 3000;
       byte b1 = (byte)sh3;
       System.out.println("b1 = " + b1);
       
       double doubleValue = 3.99999d; //d is a bit of literal syntax saying hey compiler it must be a double value
       System.out.println("doubleValue = " + doubleValue);
       
       int intValue = (int)doubleValue; //double value truncated to int
       System.out.println("intValue = " + intValue);
    }
}
