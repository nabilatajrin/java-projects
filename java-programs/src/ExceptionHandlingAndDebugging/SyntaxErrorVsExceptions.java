package ExceptionHandlingAndDebugging;

public class SyntaxErrorVsExceptions {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 1;
        //String x = "Hello"; //this causes syntax err. to solve this do the following:
        String y = "Hello";
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length - 1]; //bcz index starts from 0
        System.out.println("last char: " + lastChar);
        
        //exceptions test
        String welcome2 = "Welcome!";
        char[] chars2 = welcome2.toCharArray();
        char lastChar2 = chars[chars2.length];
        System.out.println("last char: " + lastChar2);
        
        //test
        String nothing = null;
        System.out.println(nothing); //okay
        System.out.println("String length: " + nothing.length());
    }
}
