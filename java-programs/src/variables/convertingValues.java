package variables;

public class convertingValues {
    public static void main(String[] args){
        short sh = 100;
        int i = sh;
        System.out.println("i = " + i);
        
       // short sh2 = i; //incompatible types, it's lossy conversion, i may lose data by doing this.
        
       short sh2 = (short)i;
       System.out.println("sh2 = " + sh2);
       
    }
}
