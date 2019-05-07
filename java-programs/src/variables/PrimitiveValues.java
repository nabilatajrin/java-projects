package variables;

public class PrimitiveValues {
    
    public static void main(String[] args){
        byte b = 1;
        System.out.println("byte b = " + b);
        System.out.println("Max value of byte: " + Byte.MAX_VALUE);
        b = 126;
        System.out.println("byte b = " + b);
        
        short sh = 1;
        System.out.println("\nshort sh = " + sh);
        System.out.println("Max value of short: " + Short.MAX_VALUE);
        sh = 32766;
        ++sh;
        System.out.println("\nshort sh first increment = " + sh);
        ++sh;
        System.out.println("short sh second increment = " + sh);//negative value
        
        int i = 1;
        System.out.println("\nint i = " + i);
        
        long l = 1;
        System.out.println("long l = " + l);
        
        float f = 1f;
        System.out.println("\nfloat f = " + f);
        
        double d = 1d;
        System.out.println("\ndouble d = " + d);
        
    }
}
