package variables;

public class BooleanValues {
    public static void main(String[] args){
        Boolean b1 = true;
        Boolean b2 = false; //true and false are keywords, don't mis spell them
        
        Boolean b3 = b2;
        System.out.println("b3 = " + b3);
        
        Boolean reversedB3 = !b3;
        System.out.println("reversedB3 = " + reversedB3);
        
        Boolean reversed = !reversedB3;
        System.out.println("reversed = " + reversed);
        
        int i = 0;
        Boolean b4 = (i != 0);
        System.out.println("b4 = " + b4);
        
        String s = "true";
        
        Boolean b5 = Boolean.parseBoolean(s);
        System.out.println("b5 = " + b5);
        
        Boolean b6 = Boolean.parseBoolean("xyz");
        System.out.println("b6 = " + b6);
    }
}
